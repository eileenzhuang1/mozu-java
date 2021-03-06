/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FulfillmentActionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to perform the fulfillment action.
	 * @param action The action to perform for the order fulfillment.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return performFulfillmentAction( action,  orderId,  null);
	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to perform the fulfillment action.
	 * @param responseFields Updated order with a new fulfillment status resulting from the action supplied in the request.
	 * @param action The action to perform for the order fulfillment.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.performFulfillmentActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



