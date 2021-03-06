/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.mzdb;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.mzdb.ListViewField;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListView implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String defaultSort;

	public String getDefaultSort() {
		return this.defaultSort;
	}

	public void setDefaultSort(String defaultSort) {
		this.defaultSort = defaultSort;
	}

	/**
	 * A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 */
	protected String filter;

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String security;

	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	protected List<ListViewField> fields;
	public List<ListViewField> getFields() {
		return this.fields;
	}
	public void setFields(List<ListViewField> fields) {
		this.fields = fields;
	}

	protected com.fasterxml.jackson.databind.JsonNode metaData;

	public com.fasterxml.jackson.databind.JsonNode getMetaData() {
		return this.metaData;
	}

	public void setMetaData(com.fasterxml.jackson.databind.JsonNode metaData) {
		this.metaData = metaData;
	}

}
