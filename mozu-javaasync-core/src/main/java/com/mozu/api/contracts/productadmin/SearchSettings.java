/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.search.SearchSynonymSettings;
import com.mozu.api.contracts.productadmin.SiteSearchSettings;

/**
 *	The settings to control product search and indexing behavior.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Settings of keys and values for synonyms in search results.
	 */
	protected SearchSynonymSettings searchSynonymSettings;

	public SearchSynonymSettings getSearchSynonymSettings() {
		return this.searchSynonymSettings;
	}

	public void setSearchSynonymSettings(SearchSynonymSettings searchSynonymSettings) {
		this.searchSynonymSettings = searchSynonymSettings;
	}

	/**
	 * Settings for searches performed at the site level.
	 */
	protected List<SiteSearchSettings> siteSearchSettings;
	public List<SiteSearchSettings> getSiteSearchSettings() {
		return this.siteSearchSettings;
	}
	public void setSiteSearchSettings(List<SiteSearchSettings> siteSearchSettings) {
		this.siteSearchSettings = siteSearchSettings;
	}

}
