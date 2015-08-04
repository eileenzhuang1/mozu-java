/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform.entitylists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Provides settings and options for displaying associated content within a context level of site, tenant, catalog, or master catalog. ListViews can be associated with entity lists and entities.
 * </summary>
 */
public class ListViewClient {
	
	/**
	 * Retrieves a view for associated entities. A view provides display context levels (site, tenant, catalog, master catalog) and settings.
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetViewEntityClient( entityListFullName,  viewName,  entityId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getViewEntityClient(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityClient( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * Retrieves a view for associated entities. A view provides display context levels (site, tenant, catalog, master catalog) and settings.
	 * <p><pre><code>
	 * MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient=GetViewEntityClient( entityListFullName,  viewName,  entityId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * JObject json = client.Result();
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <JObject>
	 * @see JObject
	 */
	public static MozuClient<com.fasterxml.jackson.databind.JsonNode> getViewEntityClient(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityUrl(entityId, entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.fasterxml.jackson.databind.JsonNode.class;
		MozuClient<com.fasterxml.jackson.databind.JsonNode> mozuClient = (MozuClient<com.fasterxml.jackson.databind.JsonNode>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of views for associated entities. Each view provides display context levels (site, tenant, catalog, master catalog) and settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetViewEntitiesClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getViewEntitiesClient(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntitiesClient( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of views for associated entities. Each view provides display context levels (site, tenant, catalog, master catalog) and settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient=GetViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityCollection entityCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> getViewEntitiesClient(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntitiesUrl(entityListFullName, filter, pageSize, responseFields, startIndex, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of container data for creating and displaying a view of entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetViewEntityContainerClient( entityListFullName,  viewName,  entityId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getViewEntityContainerClient(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityContainerClient( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * Retrieves a collection of container data for creating and displaying a view of entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient=GetViewEntityContainerClient( entityListFullName,  viewName,  entityId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainer entityContainer = client.Result();
	 * </code></pre></p>
	 * @param entityId Unique identifier for an entity, which defines the schema, rules, and formats for JSON entities within the MZDB (Mozu Mongo DB).
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainer>
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> getViewEntityContainerClient(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityContainerUrl(entityId, entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainer.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainer>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of container data for creating and displaying a view of entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetViewEntityContainersClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getViewEntityContainersClient(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntityContainersClient( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of container data for creating and displaying a view of entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient=GetViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityContainerCollection entityContainerCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityContainerCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getViewEntityContainersClient(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, startIndex, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a specific `EntityListView`. These views provide schema, rules, and formatting for all associated entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=GetEntityListViewClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> getEntityListViewClient(String entityListFullName, String viewName) throws Exception
	{
		return getEntityListViewClient( entityListFullName,  viewName,  null);
	}

	/**
	 * Retrieves a specific `EntityListView`. These views provide schema, rules, and formatting for all associated entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=GetEntityListViewClient( entityListFullName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> getEntityListViewClient(String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getEntityListViewUrl(entityListFullName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of `EntityListViews`. These views provide schema, rules, and formatting for all associated entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient=GetEntityListViewsClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListViewCollection listViewCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListViewCollection>
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> getEntityListViewsClient(String entityListFullName) throws Exception
	{
		return getEntityListViewsClient( entityListFullName,  null);
	}

	/**
	 * Retrieves a collection of `EntityListViews`. These views provide schema, rules, and formatting for all associated entities. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient=GetEntityListViewsClient( entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListViewCollection listViewCollection = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListViewCollection>
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> getEntityListViewsClient(String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getEntityListViewsUrl(entityListFullName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListViewCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates an entity list view. Each view provides display context levels (site, tenant, catalog, master catalog) and settings for the list of entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=CreateEntityListViewClient( listView,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> createEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName) throws Exception
	{
		return createEntityListViewClient( listView,  entityListFullName,  null);
	}

	/**
	 * Creates an entity list view. Each view provides display context levels (site, tenant, catalog, master catalog) and settings for the list of entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=CreateEntityListViewClient( listView,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> createEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.createEntityListViewUrl(entityListFullName, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(listView);
		return mozuClient;

	}

	/**
	 * Updates an existing entity list view. Each view provides display context levels (site, tenant, catalog, master catalog) and settings for the list of entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=UpdateEntityListViewClient( listView,  entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> updateEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName) throws Exception
	{
		return updateEntityListViewClient( listView,  entityListFullName,  viewName,  null);
	}

	/**
	 * Updates an existing entity list view. Each view provides display context levels (site, tenant, catalog, master catalog) and settings for the list of entities.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient=UpdateEntityListViewClient( listView,  entityListFullName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ListView listView = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @param listView Properties for the list view that specifies what fields and content display per page load. All associated fields in the list view correspond with object data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.ListView>
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.ListView> updateEntityListViewClient(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.updateEntityListViewUrl(entityListFullName, responseFields, viewName);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.mzdb.ListView.class;
		MozuClient<com.mozu.api.contracts.mzdb.ListView> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.ListView>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(listView);
		return mozuClient;

	}

	/**
	 * Deletes an entity list view. Any associated entities have the association removed.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityListViewClient( entityListFullName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityListViewClient(String entityListFullName, String viewName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.deleteEntityListViewUrl(entityListFullName, viewName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



