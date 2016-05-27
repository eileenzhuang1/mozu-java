/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.shipping.admin.profiles;

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
 * Use the ShippingInclusionRules sub-resource to manage your shipping inclusion rules that are associated with a specific shipping profile.
 * </summary>
 */
public class ShippingInclusionRuleClient {
	
	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=GetShippingInclusionRuleClient( profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> getShippingInclusionRuleClient(String profilecode, String id) throws Exception
	{
		return getShippingInclusionRuleClient( profilecode,  id,  null);
	}

	/**
	 * Retrieves the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=GetShippingInclusionRuleClient( profilecode,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> getShippingInclusionRuleClient(String profilecode, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingInclusionRuleUrl.getShippingInclusionRuleUrl(id, profilecode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> mozuClient=GetShippingInclusionRulesClient( profilecode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRuleCollection shippingInclusionRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> getShippingInclusionRulesClient(String profilecode) throws Exception
	{
		return getShippingInclusionRulesClient( profilecode,  null);
	}

	/**
	 * Retrieves a list of shipping inclusion rules and their details.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> mozuClient=GetShippingInclusionRulesClient( profilecode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRuleCollection shippingInclusionRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> getShippingInclusionRulesClient(String profilecode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingInclusionRuleUrl.getShippingInclusionRulesUrl(profilecode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=CreateShippingInclusionRuleClient( rule,  profilecode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> createShippingInclusionRuleClient(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode) throws Exception
	{
		return createShippingInclusionRuleClient( rule,  profilecode,  null);
	}

	/**
	 * Creates a new shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=CreateShippingInclusionRuleClient( rule,  profilecode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> createShippingInclusionRuleClient(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingInclusionRuleUrl.createShippingInclusionRuleUrl(profilecode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rule);
		return mozuClient;

	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=UpdateShippingInclusionRuleClient( rule,  profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> updateShippingInclusionRuleClient(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id) throws Exception
	{
		return updateShippingInclusionRuleClient( rule,  profilecode,  id,  null);
	}

	/**
	 * Updates the details of the specified shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient=UpdateShippingInclusionRuleClient( rule,  profilecode,  id,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ShippingInclusionRule shippingInclusionRule = client.Result();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param dataViewMode DataViewMode
	 * @param rule Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRule ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 * @see com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule
	 */
	public static MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> updateShippingInclusionRuleClient(com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule rule, String profilecode, String id, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingInclusionRuleUrl.updateShippingInclusionRuleUrl(id, profilecode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule.class;
		MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule> mozuClient = (MozuClient<com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rule);
		return mozuClient;

	}

	/**
	 * Deletes the specified shipping inclusion rule.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteShippingInclusionRuleClient( profilecode,  id);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param id Unique identifier of the customer segment to retrieve.
	 * @param profilecode The unique, user-defined code of the profile with which the shipping inclusion rule is associated.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteShippingInclusionRuleClient(String profilecode, String id) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.shipping.admin.profiles.ShippingInclusionRuleUrl.deleteShippingInclusionRuleUrl(id, profilecode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



