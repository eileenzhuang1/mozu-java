/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings.general;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CustomRouteSettingsClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=GetCustomRouteSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> getCustomRouteSettingsClient() throws Exception
	{
		return getCustomRouteSettingsClient( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=GetCustomRouteSettingsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> getCustomRouteSettingsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.getCustomRouteSettingsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=CreateCustomRouteSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> createCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return createCustomRouteSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=CreateCustomRouteSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> createCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.createCustomRouteSettingsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=UpdateCustomRouteSettingsClient( settings);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> updateCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings) throws Exception
	{
		return updateCustomRouteSettingsClient( settings,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient=UpdateCustomRouteSettingsClient( settings,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomRouteSettings customRouteSettings = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param settings 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 * @see com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> updateCustomRouteSettingsClient(com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.updateCustomRouteSettingsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings.class;
		MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(settings);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCustomRouteSettingsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCustomRouteSettingsClient() throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.general.CustomRouteSettingsUrl.deleteCustomRouteSettingsUrl();
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



