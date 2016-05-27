/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Master Catalog resource to view details of the master catalogs associated with a tenant and to manage the product publishing mode for each master catalog.
 * </summary>
 */
public class MasterCatalogClient {
	
	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> mozuClient=GetMasterCatalogsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalogCollection masterCatalogCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalogCollection>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> getMasterCatalogsClient() throws Exception
	{
		return getMasterCatalogsClient( null);
	}

	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> mozuClient=GetMasterCatalogsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalogCollection masterCatalogCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalogCollection>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> getMasterCatalogsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.getMasterCatalogsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalogCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=GetMasterCatalogClient( masterCatalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> getMasterCatalogClient(Integer masterCatalogId) throws Exception
	{
		return getMasterCatalogClient( masterCatalogId,  null);
	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=GetMasterCatalogClient( masterCatalogId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> getMasterCatalogClient(Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.getMasterCatalogUrl(masterCatalogId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalog.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=UpdateMasterCatalogClient( masterCatalog,  masterCatalogId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param masterCatalog Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> updateMasterCatalogClient(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId) throws Exception
	{
		return updateMasterCatalogClient( masterCatalog,  masterCatalogId,  null);
	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient=UpdateMasterCatalogClient( masterCatalog,  masterCatalogId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * MasterCatalog masterCatalog = client.Result();
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param masterCatalog Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.MasterCatalog>
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> updateMasterCatalogClient(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.MasterCatalogUrl.updateMasterCatalogUrl(masterCatalogId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.MasterCatalog.class;
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(masterCatalog);
		return mozuClient;

	}

}



