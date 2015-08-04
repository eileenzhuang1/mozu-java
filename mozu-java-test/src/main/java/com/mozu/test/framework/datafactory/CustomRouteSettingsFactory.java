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
import com.mozu.api.resources.commerce.settings.general.CustomRouteSettingsResource;

/** <summary>
 * 
 * </summary>
 */
public class CustomRouteSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCustomRouteSettings(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings getCustomRouteSettings(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings returnObj = new com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings();
		CustomRouteSettingsResource resource = new CustomRouteSettingsResource(apiContext);
		try
		{
			returnObj = resource.getCustomRouteSettings( responseFields);
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

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, int expectedCode) throws Exception
	{
		return createCustomRouteSettings(apiContext,  settings,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings createCustomRouteSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings returnObj = new com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings();
		CustomRouteSettingsResource resource = new CustomRouteSettingsResource(apiContext);
		try
		{
			returnObj = resource.createCustomRouteSettings( settings,  responseFields);
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

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, int expectedCode) throws Exception
	{
		return updateCustomRouteSettings(apiContext,  settings,  null, expectedCode);
	}

	public static com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings updateCustomRouteSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings settings, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings returnObj = new com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings();
		CustomRouteSettingsResource resource = new CustomRouteSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateCustomRouteSettings( settings,  responseFields);
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

	public static void deleteCustomRouteSettings(ApiContext apiContext, int expectedCode) throws Exception
	{
		CustomRouteSettingsResource resource = new CustomRouteSettingsResource(apiContext);
		try
		{
			resource.deleteCustomRouteSettings();
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



