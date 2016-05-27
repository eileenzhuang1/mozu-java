/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use this subresource to retrieve details about items in an active order.
 * </summary>
 */
public class OrderItemClient {
	
	/**
	 * Retrieves an order item with the order line ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemViaLineIdClient( orderId,  lineId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param lineId 
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemViaLineIdClient(String orderId, Integer lineId) throws Exception
	{
		return getOrderItemViaLineIdClient( orderId,  lineId,  null,  null);
	}

	/**
	 * Retrieves an order item with the order line ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemViaLineIdClient( orderId,  lineId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param lineId 
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemViaLineIdClient(String orderId, Integer lineId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemViaLineIdUrl(draft, lineId, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return getOrderItemClient( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Retrieves the details of a single order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient=GetOrderItemClient( orderId,  orderItemId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItem orderItem = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItem>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> getOrderItemClient(String orderId, String orderItemId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemUrl(draft, orderId, orderItemId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId) throws Exception
	{
		return getOrderItemsClient( orderId,  null,  null);
	}

	/**
	 * Retrieves the details of all items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient=GetOrderItemsClient( orderId,  draft,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderItemCollection orderItemCollection = client.Result();
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> getOrderItemsClient(String orderId, Boolean draft, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.getOrderItemsUrl(draft, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId) throws Exception
	{
		return createOrderItemClient( orderItem,  orderId,  null,  null,  null,  null);
	}

	/**
	 * Adds a new item to a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=CreateOrderItemClient( orderItem,  orderId,  updateMode,  version,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> createOrderItemClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String updateMode, String version, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.createOrderItemUrl(orderId, responseFields, skipInventoryCheck, updateMode, version);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderItem);
		return mozuClient;

	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId) throws Exception
	{
		return updateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  null,  null,  null);
	}

	/**
	 * Update the discount applied to an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateOrderItemDiscountClient( discount,  orderId,  orderItemId,  discountId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param discountId discountId parameter description DOCUMENT_HERE 
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of all applied discounts for an associated cart, order, or product. 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateOrderItemDiscountClient(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, String orderItemId, Integer discountId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateOrderItemDiscountUrl(discountId, orderId, orderItemId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discount);
		return mozuClient;

	}

	/**
	 * Update the duty fee information for an order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemDutyClient( orderId,  orderItemId,  dutyAmount);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param dutyAmount The amount added to the order item for duty fees.
        
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemDutyClient(String orderId, String orderItemId, Double dutyAmount) throws Exception
	{
		return updateItemDutyClient( orderId,  orderItemId,  dutyAmount,  null,  null,  null);
	}

	/**
	 * Update the duty fee information for an order item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemDutyClient( orderId,  orderItemId,  dutyAmount,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param dutyAmount The amount added to the order item for duty fees.
        
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemDutyClient(String orderId, String orderItemId, Double dutyAmount, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemDutyUrl(dutyAmount, orderId, orderItemId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemFulfillmentClient( orderItem,  orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemFulfillmentClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId) throws Exception
	{
		return updateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  null,  null,  null);
	}

	/**
	 * Updates the item fulfillment information for the order specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemFulfillmentClient( orderItem,  orderId,  orderItemId,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param orderItem The details associated with a specific item in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemFulfillmentClient(com.mozu.api.contracts.commerceruntime.orders.OrderItem orderItem, String orderId, String orderItemId, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemFulfillmentUrl(orderId, orderItemId, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderItem);
		return mozuClient;

	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param price The override price to specify for this item in the specified order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price) throws Exception
	{
		return updateItemProductPriceClient( orderId,  orderItemId,  price,  null,  null,  null);
	}

	/**
	 * Override the price of an individual product on a line item in the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemProductPriceClient( orderId,  orderItemId,  price,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param price The override price to specify for this item in the specified order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemProductPriceClient(String orderId, String orderItemId, Double price, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemProductPriceUrl(orderId, orderItemId, price, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity) throws Exception
	{
		return updateItemQuantityClient( orderId,  orderItemId,  quantity,  null,  null,  null);
	}

	/**
	 * Update the quantity of an item in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=UpdateItemQuantityClient( orderId,  orderItemId,  quantity,  updateMode,  version,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param quantity The number of cart items in the shopper's active cart.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> updateItemQuantityClient(String orderId, String orderItemId, Integer quantity, String updateMode, String version, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.updateItemQuantityUrl(orderId, orderItemId, quantity, responseFields, updateMode, version);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId) throws Exception
	{
		return deleteOrderItemClient( orderId,  orderItemId,  null,  null);
	}

	/**
	 * Removes a previously added item from a defined order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient=DeleteOrderItemClient( orderId,  orderItemId,  updateMode,  version);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Order order = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param orderItemId Unique identifier of the item to remove from the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.Order>
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> deleteOrderItemClient(String orderId, String orderItemId, String updateMode, String version) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderItemUrl.deleteOrderItemUrl(orderId, orderItemId, updateMode, version);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.Order.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



