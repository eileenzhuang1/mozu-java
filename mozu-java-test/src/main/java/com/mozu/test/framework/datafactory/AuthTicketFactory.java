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
import com.mozu.api.resources.platform.applications.AuthTicketResource;

/** <summary>
 * Use this resource to manage authentication tickets for your applications.
 * </summary>
 */
public class AuthTicketFactory
{

	public static com.mozu.api.contracts.appdev.AuthTicket authenticateApp(ApiContext apiContext, com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, int expectedCode, int successCode) throws Exception
	{
		return authenticateApp(apiContext,  appAuthInfo,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.appdev.AuthTicket authenticateApp(ApiContext apiContext, com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.appdev.AuthTicket returnObj = new com.mozu.api.contracts.appdev.AuthTicket();
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			returnObj = resource.authenticateApp( appAuthInfo,  responseFields);
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

	public static com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(ApiContext apiContext, com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, int expectedCode, int successCode) throws Exception
	{
		return refreshAppAuthTicket(apiContext,  authTicketRequest,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(ApiContext apiContext, com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.appdev.AuthTicket returnObj = new com.mozu.api.contracts.appdev.AuthTicket();
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			returnObj = resource.refreshAppAuthTicket( authTicketRequest,  responseFields);
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

	public static void deleteAppAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode, int successCode) throws Exception
	{
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			resource.deleteAppAuthTicket( refreshToken);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
	}

}



