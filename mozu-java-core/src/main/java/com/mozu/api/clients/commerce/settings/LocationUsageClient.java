/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Location Usages resource to define the locations and location types that interact with the specified site. The system creates three default location usage types for each site after provisioning a new tenant - one for direct ship (DS), one for in-store pickup (SP), and one for store finder (storeFinder). Each site can only use a single location for the direct ship location usage type, and the location must support the direct ship fulfillment type (DS). For the in-store pickup location usage type, each site can use one or more location types. The location service identifies all locations of the specified type that support the in-store pickup fulfillment type (SP). For the store finder location usage type, each site can use one or more location types. The location service identifies all locations of the type. Locations configured for the store finder type do not typically maintain inventory. You cannot create additional location usage types at this time.
 * </summary>
 */
public class LocationUsageClient {
	
	/**
	 * Retrieves the configured site location usages for the location usage code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> mozuClient=GetLocationUsagesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsageCollection locationUsageCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsageCollection>
	 * @see com.mozu.api.contracts.location.LocationUsageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> getLocationUsagesClient() throws Exception
	{
		return getLocationUsagesClient( null);
	}

	/**
	 * Retrieves the configured site location usages for the location usage code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> mozuClient=GetLocationUsagesClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsageCollection locationUsageCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsageCollection>
	 * @see com.mozu.api.contracts.location.LocationUsageCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> getLocationUsagesClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.LocationUsageUrl.getLocationUsagesUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationUsageCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationUsageCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the location usages for the site specified in the request header.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient=GetLocationUsageClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsage locationUsage = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsage>
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsage> getLocationUsageClient(String code) throws Exception
	{
		return getLocationUsageClient( code,  null);
	}

	/**
	 * Retrieves the location usages for the site specified in the request header.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient=GetLocationUsageClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsage locationUsage = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsage>
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsage> getLocationUsageClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.LocationUsageUrl.getLocationUsageUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationUsage.class;
		MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationUsage>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates the location usage for the site based on the location usage code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient=UpdateLocationUsageClient( usage,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsage locationUsage = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param usage Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsage>
	 * @see com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsage> updateLocationUsageClient(com.mozu.api.contracts.location.LocationUsage usage, String code) throws Exception
	{
		return updateLocationUsageClient( usage,  code,  null);
	}

	/**
	 * Updates the location usage for the site based on the location usage code specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient=UpdateLocationUsageClient( usage,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationUsage locationUsage = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param usage Configuration properties of a location usage type for a specified site. The direct ship location usage type consists of a single location that represents location that supports direct ship (DS) fulfillment. The in-store pickup location usage type consists of a list of location types that represent locations that support in-store pickup (SP) fulfillment. The store finder location usage type consists of a list of location codes, location types, or both.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationUsage>
	 * @see com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationUsage> updateLocationUsageClient(com.mozu.api.contracts.location.LocationUsage usage, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.LocationUsageUrl.updateLocationUsageUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.LocationUsage.class;
		MozuClient<com.mozu.api.contracts.location.LocationUsage> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationUsage>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(usage);
		return mozuClient;

	}

}



