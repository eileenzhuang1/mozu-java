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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the property types subresource to manage content properties.
 * </summary>
 */
public class PropertyTypeClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient=GetPropertyTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyTypeCollection propertyTypeCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyTypeCollection>
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> getPropertyTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getPropertyTypesClient(dataViewMode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient=GetPropertyTypesClient(dataViewMode,  pageSize,  startIndex);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyTypeCollection propertyTypeCollection = client.Result();
	 * </code></pre></p>
	 * @param pageSize 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyTypeCollection>
	 * @see com.mozu.api.contracts.content.PropertyTypeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> getPropertyTypesClient(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.getPropertyTypesUrl(pageSize, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PropertyTypeCollection.class;
		MozuClient<com.mozu.api.contracts.content.PropertyTypeCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient=GetPropertyTypeClient(dataViewMode,  propertyTypeName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyType propertyType = client.Result();
	 * </code></pre></p>
	 * @param propertyTypeName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.PropertyType>
	 * @see com.mozu.api.contracts.content.PropertyType
	 */
	public static MozuClient<com.mozu.api.contracts.content.PropertyType> getPropertyTypeClient(com.mozu.api.DataViewMode dataViewMode, String propertyTypeName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.getPropertyTypeUrl(propertyTypeName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.PropertyType.class;
		MozuClient<com.mozu.api.contracts.content.PropertyType> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the value types associated with a content property.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.content.PropertyValueType>> mozuClient=PropertyValueTypesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PropertyValueType propertyValueType = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.content.PropertyValueType>>
	 * @see com.mozu.api.contracts.content.PropertyValueType
	 */
	public static MozuClient<List<com.mozu.api.contracts.content.PropertyValueType>> propertyValueTypesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.PropertyTypeUrl.propertyValueTypesUrl();
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.content.PropertyValueType>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.content.PropertyValueType>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



