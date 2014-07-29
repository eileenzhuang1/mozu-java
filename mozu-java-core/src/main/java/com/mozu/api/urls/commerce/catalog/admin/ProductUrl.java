/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductUrl
{

	/**
	 * Get Resource Url for GetProducts
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param noCount If true, the operation does not return the TotalCount number of results.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of product search terms to use in the query when searching across product code and product name. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductsUrl(String filter, Boolean noCount, Integer pageSize, String q, Integer qLimit, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&q={q}&qLimit={qLimit}&noCount={noCount}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("noCount", noCount);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("q", q);
		formatter.formatUrl("qLimit", qLimit);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProduct
	 * @param productCode Merchant-created code associated with the product such as a SKU. Max length: 30. Accepts a to z, A to Z, Ãƒâ€¹-ÃƒËœ, 0 to 9, #, semicolon, commas, apostrophes, and Spaces, but no punctuation or other characters.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInCatalogs
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInCatalogsUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProductInCatalog
	 * @param catalogId 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl getProductInCatalogUrl(Integer catalogId, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}");
		formatter.formatUrl("catalogId", catalogId);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProduct
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProductInCatalog
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl addProductInCatalogUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProduct
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductInCatalogs
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductInCatalogsUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProductInCatalog
	 * @param catalogId 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateProductInCatalogUrl(Integer catalogId, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}");
		formatter.formatUrl("catalogId", catalogId);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProduct
	 * @param productCode 
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProductInCatalog
	 * @param catalogId 
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteProductInCatalogUrl(Integer catalogId, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId}");
		formatter.formatUrl("catalogId", catalogId);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

