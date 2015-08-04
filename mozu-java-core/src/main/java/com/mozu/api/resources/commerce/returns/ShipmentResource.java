/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.returns;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Return Shipments subresource to manage shipments for a return replacement.
 * </summary>
 */
public class ShipmentResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShipmentResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the details of the specified return replacement shipment.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Shipment shipment = shipment.getShipment( returnId,  shipmentId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(String returnId, String shipmentId) throws Exception
	{
		return getShipment( returnId,  shipmentId,  null);
	}

	/**
	 * Retrieves the details of the specified return replacement shipment.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Shipment shipment = shipment.getShipment( returnId,  shipmentId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Shipment
	 */
	public com.mozu.api.contracts.commerceruntime.fulfillment.Shipment getShipment(String returnId, String shipmentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Shipment> client = com.mozu.api.clients.commerce.returns.ShipmentClient.getShipmentClient( returnId,  shipmentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a shipment from one or more packages associated with a return replacement.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	Package package = shipment.createPackageShipments( packageIds,  returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param packageIds List of unique identifiers for each package associated with this shipment. Not all packages must belong to the same shipment.
	 * @return List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Package
	 * @see string
	 */
	public List<com.mozu.api.contracts.commerceruntime.fulfillment.Package> createPackageShipments(List<String> packageIds, String returnId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.fulfillment.Package>> client = com.mozu.api.clients.commerce.returns.ShipmentClient.createPackageShipmentsClient( packageIds,  returnId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a shipment for a return replacement.
	 * <p><pre><code>
	 *	Shipment shipment = new Shipment();
	 *	shipment.deleteShipment( returnId,  shipmentId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return 
	 */
	public void deleteShipment(String returnId, String shipmentId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.returns.ShipmentClient.deleteShipmentClient( returnId,  shipmentId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



