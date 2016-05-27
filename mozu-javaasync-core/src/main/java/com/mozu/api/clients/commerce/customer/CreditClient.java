/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer;

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
 * Use the Customer Credits resource to manage the store credit associated with a customer account. Store credit can represent a static amount the customer can redeem at any of the tenant's sites, or a gift card registered for a customer account. At this time, gift card functionality is reserved for future use.
 * </summary>
 */
public class CreditClient {
	
	/**
	 * Retrieves a list of store credits applied to customer accounts, according any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient=GetCreditsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditCollection creditCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> getCreditsClient() throws Exception
	{
		return getCreditsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of store credits applied to customer accounts, according any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient=GetCreditsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CreditCollection creditCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.CreditCollection>
	 * @see com.mozu.api.contracts.customer.credit.CreditCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> getCreditsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.getCreditsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.CreditCollection.class;
		MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.CreditCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a store credit applied to a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=GetCreditClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> getCreditClient(String code) throws Exception
	{
		return getCreditClient( code,  null);
	}

	/**
	 * Retrieves the details of a store credit applied to a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=GetCreditClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> getCreditClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.getCreditUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new store credit for the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AddCreditClient( credit);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> addCreditClient(com.mozu.api.contracts.customer.credit.Credit credit) throws Exception
	{
		return addCreditClient( credit,  null);
	}

	/**
	 * Creates a new store credit for the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AddCreditClient( credit,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> addCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.addCreditUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(credit);
		return mozuClient;

	}

	/**
	 * Associates an unclaimed customer credit with the shopper user authenticated in the request header.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AssociateCreditToShopperClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> associateCreditToShopperClient(String code) throws Exception
	{
		return associateCreditToShopperClient( code,  null);
	}

	/**
	 * Associates an unclaimed customer credit with the shopper user authenticated in the request header.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=AssociateCreditToShopperClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> associateCreditToShopperClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.associateCreditToShopperUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * customer-credits Put ResendCreditCreatedEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendCreditCreatedEmailClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient resendCreditCreatedEmailClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.resendCreditCreatedEmailUrl(code);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a defined store credit applied to a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=UpdateCreditClient( credit,  code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> updateCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String code) throws Exception
	{
		return updateCreditClient( credit,  code,  null);
	}

	/**
	 * Updates one or more properties of a defined store credit applied to a customer account.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient=UpdateCreditClient( credit,  code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Credit credit = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param credit Properties of the store credit of gift card applied to a customer account. At this time, gift card functionality is reserved for future use.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.credit.Credit>
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 * @see com.mozu.api.contracts.customer.credit.Credit
	 */
	public static MozuClient<com.mozu.api.contracts.customer.credit.Credit> updateCreditClient(com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.updateCreditUrl(code, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.customer.credit.Credit.class;
		MozuClient<com.mozu.api.contracts.customer.credit.Credit> mozuClient = (MozuClient<com.mozu.api.contracts.customer.credit.Credit>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(credit);
		return mozuClient;

	}

	/**
	 * Deletes a store credit previously applied to a customer account.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCreditClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCreditClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.CreditUrl.deleteCreditUrl(code);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



