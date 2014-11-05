/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.VisitResource;

/** <summary>
 * Use the Visits resource to manage all visits a customer makes to a tenant's sites and measure the level of transactions a customer performs during a unique visit for customer account analytics. Clients can track customer visits by site (including online and in-person interactions), the transactions a customer performs during the visit, and the device type associated with the visit, if any.
 * </summary>
 */
public class VisitFactory
{

	public static com.mozu.api.contracts.customer.VisitCollection getVisits(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getVisits(apiContext,  null,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.VisitCollection getVisits(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.VisitCollection returnObj = new com.mozu.api.contracts.customer.VisitCollection();
		VisitResource resource = new VisitResource(apiContext);
		try
		{
			returnObj = resource.getVisits( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.customer.Visit getVisit(ApiContext apiContext, String visitId, int expectedCode, int successCode) throws Exception
	{
		return getVisit(apiContext,  visitId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.Visit getVisit(ApiContext apiContext, String visitId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.Visit returnObj = new com.mozu.api.contracts.customer.Visit();
		VisitResource resource = new VisitResource(apiContext);
		try
		{
			returnObj = resource.getVisit( visitId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.customer.Visit addVisit(ApiContext apiContext, com.mozu.api.contracts.customer.Visit visit, int expectedCode, int successCode) throws Exception
	{
		return addVisit(apiContext,  visit,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.Visit addVisit(ApiContext apiContext, com.mozu.api.contracts.customer.Visit visit, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.Visit returnObj = new com.mozu.api.contracts.customer.Visit();
		VisitResource resource = new VisitResource(apiContext);
		try
		{
			returnObj = resource.addVisit( visit,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.customer.Visit updateVisit(ApiContext apiContext, com.mozu.api.contracts.customer.Visit visit, String visitId, int expectedCode, int successCode) throws Exception
	{
		return updateVisit(apiContext,  visit,  visitId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.Visit updateVisit(ApiContext apiContext, com.mozu.api.contracts.customer.Visit visit, String visitId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.Visit returnObj = new com.mozu.api.contracts.customer.Visit();
		VisitResource resource = new VisitResource(apiContext);
		try
		{
			returnObj = resource.updateVisit( visit,  visitId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;
	}

}



