/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class LocationInventoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public LocationInventoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.GetLocationInventory(dataViewMode,  locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoryClient(dataViewMode,  locationCode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.GetLocationInventories(dataViewMode,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(com.mozu.api.DataViewMode dataViewMode, String locationCode) throws Exception
	{
		return getLocationInventories(dataViewMode,  locationCode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.GetLocationInventories(dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(com.mozu.api.DataViewMode dataViewMode, String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoriesClient(dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.AddLocationInventory(dataViewMode,  locationInventoryList,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode) throws Exception
	{
		return addLocationInventory(dataViewMode,  locationInventoryList,  locationCode,  null);
	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.AddLocationInventory(dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param performUpserts 
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.addLocationInventoryClient(dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the active stock on hand inventory of products for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.UpdateLocationInventory(dataViewMode,  locationInventoryAdjustments,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments 
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.updateLocationInventoryClient(dataViewMode,  locationInventoryAdjustments,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the product code inventory definition for the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	locationinventory.DeleteLocationInventory(dataViewMode,  locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteLocationInventory(com.mozu.api.DataViewMode dataViewMode, String locationCode, String productCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.deleteLocationInventoryClient(dataViewMode,  locationCode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();

	}

}



