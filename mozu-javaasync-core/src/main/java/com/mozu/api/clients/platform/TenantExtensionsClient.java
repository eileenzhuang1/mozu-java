/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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
 * platform/extensions related resources. DOCUMENT_HERE 
 * </summary>
 */
public class TenantExtensionsClient {
	
	/**
	 * platform-extensions Get GetExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=GetExtensionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> getExtensionsClient() throws Exception
	{
		return getExtensionsClient( null);
	}

	/**
	 * platform-extensions Get GetExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=GetExtensionsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> getExtensionsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.TenantExtensionsUrl.getExtensionsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.installedapplications.TenantExtensions.class;
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-extensions Put UpdateExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=UpdateExtensionsClient( extensions);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param extensions Mozu.InstalledApplications.Contracts.TenantExtensions ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> updateExtensionsClient(com.mozu.api.contracts.installedapplications.TenantExtensions extensions) throws Exception
	{
		return updateExtensionsClient( extensions,  null);
	}

	/**
	 * platform-extensions Put UpdateExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=UpdateExtensionsClient( extensions,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param extensions Mozu.InstalledApplications.Contracts.TenantExtensions ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> updateExtensionsClient(com.mozu.api.contracts.installedapplications.TenantExtensions extensions, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.TenantExtensionsUrl.updateExtensionsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.installedapplications.TenantExtensions.class;
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extensions);
		return mozuClient;

	}

}



