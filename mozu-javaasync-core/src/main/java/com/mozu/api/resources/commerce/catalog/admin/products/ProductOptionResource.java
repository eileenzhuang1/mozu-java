/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.products;

import com.mozu.api.ApiContext;
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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Options resource to configure the option attributes and vocabulary values for an individual product associated with the product type that uses the option attribute. Options are used to generate variations of a product.
 * </summary>
 */
public class ProductOptionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public ProductOptionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public ProductOptionResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a list of all option attributes configured for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.getOptions( productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return List<com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public List<com.mozu.api.contracts.productadmin.ProductOption> getOptions(String productCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionsClient(_dataViewMode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all option attributes configured for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.getOptions( productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.productadmin.ProductOption>
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch getOptionsAsync(String productCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.ProductOption>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductOption>> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionsClient(_dataViewMode,  productCode);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.getOption( productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption getOption(String productCode, String attributeFQN) throws Exception
	{
		return getOption( productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.getOption( productCode,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch getOptionAsync(String productCode, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		return getOptionAsync( productCode,  attributeFQN,  null, callback);
	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.getOption( productCode,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption getOption(String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionClient(_dataViewMode,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an option attribute configuration for the specified product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.getOption( productCode,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch getOptionAsync(String productCode, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.getOptionClient(_dataViewMode,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.addOption( productOption,  productCode);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption addOption(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode) throws Exception
	{
		return addOption( productOption,  productCode,  null);
	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.addOption( productOption,  productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch addOptionAsync(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		return addOptionAsync( productOption,  productCode,  null, callback);
	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.addOption( productOption,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption addOption(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.addOptionClient(_dataViewMode,  productOption,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Configures an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.addOption( productOption,  productCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch addOptionAsync(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.addOptionClient(_dataViewMode,  productOption,  productCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.updateOption( productOption,  productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption updateOption(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN) throws Exception
	{
		return updateOption( productOption,  productCode,  attributeFQN,  null);
	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.updateOption( productOption,  productCode,  attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch updateOptionAsync(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		return updateOptionAsync( productOption,  productCode,  attributeFQN,  null, callback);
	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	ProductOption productOption = productoption.updateOption( productOption,  productCode,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public com.mozu.api.contracts.productadmin.ProductOption updateOption(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.updateOptionClient(_dataViewMode,  productOption,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of an option attribute configured for a product.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	CountDownLatch latch = productoption.updateOption( productOption,  productCode,  attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param productOption Properties of the product option to create such as attribute detail, fully qualified name, and list of product option values.
	 * @return com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 * @see com.mozu.api.contracts.productadmin.ProductOption
	 */
	public CountDownLatch updateOptionAsync(com.mozu.api.contracts.productadmin.ProductOption productOption, String productCode, String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.ProductOption> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.ProductOption> client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.updateOptionClient(_dataViewMode,  productOption,  productCode,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the configuration of an option attribute for the product specified in the request.
	 * <p><pre><code>
	 *	ProductOption productoption = new ProductOption();
	 *	productoption.deleteOption( productCode,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return 
	 */
	public void deleteOption(String productCode, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.products.ProductOptionClient.deleteOptionClient(_dataViewMode,  productCode,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



