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
import com.mozu.api.resources.commerce.orders.FulfillmentInfoResource;

/** <summary>
 * Use the Fulfillment Information resource to manage shipping or pickup information for orders.
 * </summary>
 */
public class FulfillmentInfoFactory
{

	public static com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo getFulfillmentInfo(ApiContext apiContext, String orderId, int expectedCode, int successCode) throws Exception
	{
		return getFulfillmentInfo(apiContext,  orderId,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo getFulfillmentInfo(ApiContext apiContext, String orderId, Boolean draft, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo();
		FulfillmentInfoResource resource = new FulfillmentInfoResource(apiContext);
		try
		{
			returnObj = resource.getFulfillmentInfo( orderId,  draft,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo setFulFillmentInfo(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, int expectedCode, int successCode) throws Exception
	{
		return setFulFillmentInfo(apiContext,  fulfillmentInfo,  orderId,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo setFulFillmentInfo(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo fulfillmentInfo, String orderId, String updateMode, String version, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo returnObj = new com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentInfo();
		FulfillmentInfoResource resource = new FulfillmentInfoResource(apiContext);
		try
		{
			returnObj = resource.setFulFillmentInfo( fulfillmentInfo,  orderId,  updateMode,  version,  responseFields);
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



