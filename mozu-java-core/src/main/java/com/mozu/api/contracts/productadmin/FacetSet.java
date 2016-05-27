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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.FacetSource;
import com.mozu.api.contracts.productadmin.Facet;

/**
 *	The list of category, price, and attribute facets defined or available for definition for the category.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetSet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The list of subcategories and attributes that have not been defined as facets for the category.
	 */
	protected List<FacetSource> available;
	public List<FacetSource> getAvailable() {
		return this.available;
	}
	public void setAvailable(List<FacetSource> available) {
		this.available = available;
	}

	/**
	 * The list of category, price, and attribute facets defined for the category.
	 */
	protected List<Facet> configured;
	public List<Facet> getConfigured() {
		return this.configured;
	}
	public void setConfigured(List<Facet> configured) {
		this.configured = configured;
	}


}
