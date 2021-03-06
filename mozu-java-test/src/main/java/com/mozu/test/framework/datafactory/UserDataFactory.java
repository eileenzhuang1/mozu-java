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
import com.mozu.api.resources.platform.UserDataResource;

/** <summary>
 * Use the user data subresource to store user-level data required for a third-party application in the Mozu database.
 * </summary>
 */
public class UserDataFactory
{

	public static String getDBValue(ApiContext apiContext, String dbEntryQuery, int expectedCode, int successCode) throws Exception
	{
		return getDBValue(apiContext,  dbEntryQuery,  null, expectedCode, successCode );
	}

	public static String getDBValue(ApiContext apiContext, String dbEntryQuery, String responseFields, int expectedCode, int successCode) throws Exception
	{
		String returnObj = new String();
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			returnObj = resource.getDBValue( dbEntryQuery,  responseFields);
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

	public static void createDBValue(ApiContext apiContext, String value, String dbEntryQuery, int expectedCode, int successCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.createDBValue( value,  dbEntryQuery);
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

	public static void updateDBValue(ApiContext apiContext, String value, String dbEntryQuery, int expectedCode, int successCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.updateDBValue( value,  dbEntryQuery);
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

	public static void deleteDBValue(ApiContext apiContext, String dbEntryQuery, int expectedCode, int successCode) throws Exception
	{
		UserDataResource resource = new UserDataResource(apiContext);
		try
		{
			resource.deleteDBValue( dbEntryQuery);
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



