/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactClient {
	
	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContactClient( accountId,  contactId,  null);
	}

	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=GetAccountContactClient( accountId,  contactId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> getAccountContactClient(Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactUrl(accountId, contactId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId) throws Exception
	{
		return getAccountContactsClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient=GetAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContactCollection customerContactCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContactCollection>
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> getAccountContactsClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.getAccountContactsUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContactCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=AddAccountContactClient( contact,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> addAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		return addAccountContactClient( contact,  accountId,  null);
	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=AddAccountContactClient( contact,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> addAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.addAccountContactUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContactClient( contact,  accountId,  contactId,  null);
	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient=UpdateAccountContactClient( contact,  accountId,  contactId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerContact customerContact = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerContact>
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerContact> updateAccountContactClient(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.updateAccountContactUrl(accountId, contactId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerContact.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerContact>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(contact);
		return mozuClient;

	}

	/**
	 * Deletes a contact for the specified customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAccountContactClient( accountId,  contactId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAccountContactClient(Integer accountId, Integer contactId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerContactUrl.deleteAccountContactUrl(accountId, contactId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



