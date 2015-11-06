/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.FacetResource;

/** <summary>
 * Use the Facets resource to manage the facets shoppers use to filter product display results on a storefront. Facets can include categories, product attributes, or prices, and use either a range of values or discrete values.
 * </summary>
 */
public class AdminFacetFactory
{

	public static com.mozu.api.contracts.productadmin.Facet getFacet(ApiContext apiContext, Integer facetId, int expectedCode) throws Exception
	{
		return getFacet(apiContext,  facetId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Facet getFacet(ApiContext apiContext, Integer facetId, Boolean validate, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Facet returnObj = new com.mozu.api.contracts.productadmin.Facet();
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			returnObj = resource.getFacet( facetId,  validate,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.FacetSet getFacetCategoryList(ApiContext apiContext, Integer categoryId, int expectedCode) throws Exception
	{
		return getFacetCategoryList(apiContext,  categoryId,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.FacetSet getFacetCategoryList(ApiContext apiContext, Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.FacetSet returnObj = new com.mozu.api.contracts.productadmin.FacetSet();
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			returnObj = resource.getFacetCategoryList( categoryId,  includeAvailable,  validate,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.Facet addFacet(ApiContext apiContext, com.mozu.api.contracts.productadmin.Facet facet, int expectedCode) throws Exception
	{
		return addFacet(apiContext,  facet,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Facet addFacet(ApiContext apiContext, com.mozu.api.contracts.productadmin.Facet facet, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Facet returnObj = new com.mozu.api.contracts.productadmin.Facet();
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			returnObj = resource.addFacet( facet,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.productadmin.Facet updateFacet(ApiContext apiContext, com.mozu.api.contracts.productadmin.Facet facet, Integer facetId, int expectedCode) throws Exception
	{
		return updateFacet(apiContext,  facet,  facetId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.Facet updateFacet(ApiContext apiContext, com.mozu.api.contracts.productadmin.Facet facet, Integer facetId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.Facet returnObj = new com.mozu.api.contracts.productadmin.Facet();
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			returnObj = resource.updateFacet( facet,  facetId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteFacetById(ApiContext apiContext, Integer facetId, int expectedCode) throws Exception
	{
		FacetResource resource = new FacetResource(apiContext);
		try
		{
			resource.deleteFacetById( facetId);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



