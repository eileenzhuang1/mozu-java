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
import com.mozu.api.resources.platform.ApplicationResource;

/** <summary>
 * Use the Applications resource to update and retrieve details about the applications installed for your tenant.
 * </summary>
 */
public class PlatformApplicationFactory
{

	public static com.mozu.api.contracts.installedapplications.Application getApplication(ApiContext apiContext, String appId, int expectedCode, int successCode) throws Exception
	{
		return getApplication(apiContext,  appId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.installedapplications.Application getApplication(ApiContext apiContext, String appId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.installedapplications.Application returnObj = new com.mozu.api.contracts.installedapplications.Application();
		ApplicationResource resource = new ApplicationResource(apiContext);
		try
		{
			returnObj = resource.getApplication( appId,  responseFields);
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

	public static com.mozu.api.contracts.installedapplications.Application updateApplication(ApiContext apiContext, com.mozu.api.contracts.installedapplications.Application application, String appId, int expectedCode, int successCode) throws Exception
	{
		return updateApplication(apiContext,  application,  appId,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.installedapplications.Application updateApplication(ApiContext apiContext, com.mozu.api.contracts.installedapplications.Application application, String appId, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.installedapplications.Application returnObj = new com.mozu.api.contracts.installedapplications.Application();
		ApplicationResource resource = new ApplicationResource(apiContext);
		try
		{
			returnObj = resource.updateApplication( application,  appId,  responseFields);
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



