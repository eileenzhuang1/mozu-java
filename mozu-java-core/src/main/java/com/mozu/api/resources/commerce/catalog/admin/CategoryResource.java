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
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CategoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories() throws Exception
	{
		return getCategories( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryPagedCollection categoryPagedCollection = category.getCategories( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter product category search results by any of its properties, including its position in the category hierarchy. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryPagedCollection getCategories(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoriesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getChildCategories( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category for which to retrieve subcategories.
	 * @return com.mozu.api.contracts.productadmin.CategoryCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(Integer categoryId) throws Exception
	{
		return getChildCategories( categoryId,  null);
	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	CategoryCollection categoryCollection = category.getChildCategories( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category for which to retrieve subcategories.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.CategoryCollection
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public com.mozu.api.contracts.productadmin.CategoryCollection getChildCategories(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getChildCategoriesClient( categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId) throws Exception
	{
		return getCategory( categoryId,  null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.getCategory( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category getCategory(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.getCategoryClient( categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.addCategory( category);
	 * </code></pre></p>
	 * @param category Properties of the new category to create. You must specify a name and parent category if you want to create it as a subcategory.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategory( category,  null,  null);
	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.addCategory( category,  incrementSequence,  responseFields);
	 * </code></pre></p>
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param category Properties of the new category to create. You must specify a name and parent category if you want to create it as a subcategory.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category addCategory(com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.addCategoryClient( category,  incrementSequence,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.updateCategory( category,  categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category Properties of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategory( category,  categoryId,  null,  null);
	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	Category category = category.updateCategory( category,  categoryId,  cascadeVisibility,  responseFields);
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param category Properties of the category to modify.
	 * @return com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public com.mozu.api.contracts.productadmin.Category updateCategory(com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Category> client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.updateCategoryClient( category,  categoryId,  cascadeVisibility,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.deleteCategoryById( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to delete.
	 * @return 
	 */
	public void deleteCategoryById(Integer categoryId) throws Exception
	{
		deleteCategoryById( categoryId,  null);
	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 *	Category category = new Category();
	 *	category.deleteCategoryById( categoryId,  cascadeDelete);
	 * </code></pre></p>
	 * @param cascadeDelete If true, also delete all subcategories associated with the specified category.
	 * @param categoryId Unique identifier of the category to delete.
	 * @return 
	 */
	public void deleteCategoryById(Integer categoryId, Boolean cascadeDelete) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.CategoryClient.deleteCategoryByIdClient( categoryId,  cascadeDelete);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



