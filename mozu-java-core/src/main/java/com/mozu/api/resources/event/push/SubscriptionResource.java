/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.event.push;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * 
 * </summary>
 */
public class SubscriptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public SubscriptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Subscription subscription = new Subscription();
	 *	SubscriptionCollection subscriptionCollection = subscription.getSubscriptions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.event.SubscriptionCollection
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public com.mozu.api.contracts.event.SubscriptionCollection getSubscriptions() throws Exception
	{
		return getSubscriptions( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Subscription subscription = new Subscription();
	 *	SubscriptionCollection subscriptionCollection = subscription.getSubscriptions( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.event.SubscriptionCollection
	 * @see com.mozu.api.contracts.event.SubscriptionCollection
	 */
	public com.mozu.api.contracts.event.SubscriptionCollection getSubscriptions(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.event.SubscriptionCollection> client = com.mozu.api.clients.event.push.SubscriptionClient.getSubscriptionsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



