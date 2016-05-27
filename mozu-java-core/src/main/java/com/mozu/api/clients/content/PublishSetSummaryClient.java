/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * content/publishsets related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublishSetSummaryClient {
	
	/**
	 * Returns a List of current Publishing sets with counts of drafts in each
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient=GetPublishSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> getPublishSetsClient() throws Exception
	{
		return getPublishSetsClient( null,  null,  null);
	}

	/**
	 * Returns a List of current Publishing sets with counts of drafts in each
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient=GetPublishSetsClient( pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PublishSetSummaryPagedCollection publishSetSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.PublishSetSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> getPublishSetsClient(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.getPublishSetsUrl(pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PublishSetSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.PublishSetSummaryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieve a paged collection of publish set Items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=GetPublishSetItemsClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> getPublishSetItemsClient(String code) throws Exception
	{
		return getPublishSetItemsClient( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieve a paged collection of publish set Items.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=GetPublishSetItemsClient( code,  pageSize,  startIndex,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> getPublishSetItemsClient(String code, Integer pageSize, Integer startIndex, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.getPublishSetItemsUrl(code, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=DeletePublishSetClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 */
	public static MozuClient<Object> deletePublishSetClient(String code) throws Exception
	{
		return deletePublishSetClient( code,  null,  null);
	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=DeletePublishSetClient( code,  shouldDiscard,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param shouldDiscard Specifies whether to discard the pending content changes assigned to the content publish set when the publish set is deleted.
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 */
	public static MozuClient<Object> deletePublishSetClient(String code, Boolean shouldDiscard, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.deletePublishSetUrl(code, responseFields, shouldDiscard);
		String verb = "POST";
		Class<?> clz = Object.class;
		MozuClient<Object> mozuClient = (MozuClient<Object>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=AddPublishSetItemsClient( itemsToPublish,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param itemsToPublish Mozu.Content.Contracts.AddOrDeletePublishItem ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public static MozuClient<Object> addPublishSetItemsClient(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code) throws Exception
	{
		return addPublishSetItemsClient( itemsToPublish,  code,  null);
	}

	/**
	 * Adds a set of documents by id to a publish set
	 * <p><pre><code>
	 * MozuClient<Object> mozuClient=AddPublishSetItemsClient( itemsToPublish,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * object object = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param itemsToPublish Mozu.Content.Contracts.AddOrDeletePublishItem ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <object>
	 * @see object
	 * @see com.mozu.api.contracts.content.AddOrDeletePublishItem
	 */
	public static MozuClient<Object> addPublishSetItemsClient(List<com.mozu.api.contracts.content.AddOrDeletePublishItem> itemsToPublish, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PublishSetSummaryUrl.addPublishSetItemsUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = Object.class;
		MozuClient<Object> mozuClient = (MozuClient<Object>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(itemsToPublish);
		return mozuClient;

	}

}



