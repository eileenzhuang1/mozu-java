/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.SearchSuggestionGroup;

/**
 *	The results of the suggested search terms made to the customer based on queries.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSuggestionResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Text that the shopper types in a search query.
	 */
	protected  String query;

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * List of SearchSuggestionGroups
	 */
	protected List<SearchSuggestionGroup> suggestionGroups;
	public List<SearchSuggestionGroup> getSuggestionGroups() {
		return this.suggestionGroups;
	}
	public void setSuggestionGroups(List<SearchSuggestionGroup> suggestionGroups) {
		this.suggestionGroups = suggestionGroups;
	}


}
