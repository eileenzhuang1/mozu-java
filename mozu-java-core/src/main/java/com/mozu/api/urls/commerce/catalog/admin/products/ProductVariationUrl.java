/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.products;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductVariationUrl
{

	/**
	 * Get Resource Url for GetProductVariationLocalizedDeltaPrices
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationLocalizedDeltaPricesUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductVariationLocalizedDeltaPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationLocalizedDeltaPriceUrl(String currencyCode, String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductVariationLocalizedPrices
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationLocalizedPricesUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductVariationLocalizedPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationLocalizedPriceUrl(String currencyCode, String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductVariation
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationUrl(String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductVariations
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductVariationsUrl(String filter, Integer pageSize, String productCode, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProductVariationLocalizedDeltaPrice
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductVariationLocalizedDeltaPriceUrl(String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProductVariationLocalizedPrice
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductVariationLocalizedPriceUrl(String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariationLocalizedDeltaPrices
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationLocalizedDeltaPricesUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariationLocalizedDeltaPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationLocalizedDeltaPriceUrl(String currencyCode, String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariationLocalizedPrices
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationLocalizedPricesUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariationLocalizedPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationLocalizedPriceUrl(String currencyCode, String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}?responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariation
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationUrl(String productCode, String responseFields, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductVariations
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductVariationsUrl(String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductVariation
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductVariationUrl(String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductVariationLocalizedDeltaPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductVariationLocalizedDeltaPriceUrl(String currencyCode, String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductVariationLocalizedPrice
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductVariationLocalizedPriceUrl(String currencyCode, String productCode, String variationKey)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("variationKey", variationKey);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

