/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Search resource manages all settings and options for providing product search on your site.
 * </summary>
 */
public class SearchResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SearchResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * admin-search Get GetSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		return getSearchTuningRule( searchTuningRuleCode,  null);
	}

	/**
	 * admin-search Get GetSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.getSearchTuningRule( searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleCode 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule getSearchTuningRule(String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleClient( searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-search Get GetSearchTuningRules description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules() throws Exception
	{
		return getSearchTuningRules( null,  null,  null,  null,  null);
	}

	/**
	 * admin-search Get GetSearchTuningRules description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRuleCollection searchTuningRuleCollection = search.getSearchTuningRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection getSearchTuningRules(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRuleCollection> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	Stream stream = search.getSearchTuningRuleSortFields();
	 * </code></pre></p>
	 * @return Stream
	 * @see Stream
	 */
	public java.io.InputStream getSearchTuningRuleSortFields() throws Exception
	{
		MozuClient<java.io.InputStream> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSearchTuningRuleSortFieldsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings() throws Exception
	{
		return getSettings( null);
	}

	/**
	 * Get site search settings
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.getSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings getSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.getSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-search Post AddSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn);
	 * </code></pre></p>
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn) throws Exception
	{
		return addSearchTuningRule( searchTuningRuleIn,  null);
	}

	/**
	 * admin-search Post AddSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.addSearchTuningRule( searchTuningRuleIn,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule addSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.addSearchTuningRuleClient( searchTuningRuleIn,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	search.updateSearchTuningRuleSortFields( searchTuningRuleSortFieldsIn);
	 * </code></pre></p>
	 * @param searchTuningRuleSortFieldsIn 
	 * @return 
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields
	 */
	public void updateSearchTuningRuleSortFields(com.mozu.api.contracts.productadmin.search.SearchTuningRuleSortFields searchTuningRuleSortFieldsIn) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleSortFieldsClient( searchTuningRuleSortFieldsIn);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * admin-search Put UpdateSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode) throws Exception
	{
		return updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  null);
	}

	/**
	 * admin-search Put UpdateSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchTuningRule searchTuningRule = search.updateSearchTuningRule( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param searchTuningRuleCode 
	 * @param searchTuningRuleIn Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 * @see com.mozu.api.contracts.productadmin.search.SearchTuningRule
	 */
	public com.mozu.api.contracts.productadmin.search.SearchTuningRule updateSearchTuningRule(com.mozu.api.contracts.productadmin.search.SearchTuningRule searchTuningRuleIn, String searchTuningRuleCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.search.SearchTuningRule> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSearchTuningRuleClient( searchTuningRuleIn,  searchTuningRuleCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings);
	 * </code></pre></p>
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings) throws Exception
	{
		return updateSettings( settings,  null);
	}

	/**
	 * Adds or Updates (Upsert) the Search Settings for a specific site
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	SearchSettings searchSettings = search.updateSettings( settings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param settings The settings to control product search and indexing behavior.
	 * @return com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 * @see com.mozu.api.contracts.productadmin.SearchSettings
	 */
	public com.mozu.api.contracts.productadmin.SearchSettings updateSettings(com.mozu.api.contracts.productadmin.SearchSettings settings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.SearchSettings> client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.updateSettingsClient( settings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * admin-search Delete DeleteSearchTuningRule description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	Search search = new Search();
	 *	search.deleteSearchTuningRule( searchTuningRuleCode);
	 * </code></pre></p>
	 * @param searchTuningRuleCode 
	 * @return 
	 */
	public void deleteSearchTuningRule(String searchTuningRuleCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.SearchClient.deleteSearchTuningRuleClient( searchTuningRuleCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



