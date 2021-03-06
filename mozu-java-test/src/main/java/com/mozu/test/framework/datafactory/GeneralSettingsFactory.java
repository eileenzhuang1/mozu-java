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
import com.mozu.api.resources.commerce.settings.GeneralSettingsResource;

/** <summary>
 * Define global site settings such as the site name, shipping and email addresses, and logo images. Block undesirable IP addresses using this resource.
 * </summary>
 */
public class GeneralSettingsFactory
{

	public static com.mozu.api.contracts.sitesettings.general.GeneralSettings getGeneralSettings(ApiContext apiContext, int expectedCode, int successCode) throws Exception
	{
		return getGeneralSettings(apiContext,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.general.GeneralSettings getGeneralSettings(ApiContext apiContext, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.GeneralSettings returnObj = new com.mozu.api.contracts.sitesettings.general.GeneralSettings();
		GeneralSettingsResource resource = new GeneralSettingsResource(apiContext);
		try
		{
			returnObj = resource.getGeneralSettings( responseFields);
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

	public static com.mozu.api.contracts.sitesettings.general.GeneralSettings updateGeneralSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings, int expectedCode, int successCode) throws Exception
	{
		return updateGeneralSettings(apiContext,  generalSettings,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.sitesettings.general.GeneralSettings updateGeneralSettings(ApiContext apiContext, com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.sitesettings.general.GeneralSettings returnObj = new com.mozu.api.contracts.sitesettings.general.GeneralSettings();
		GeneralSettingsResource resource = new GeneralSettingsResource(apiContext);
		try
		{
			returnObj = resource.updateGeneralSettings( generalSettings,  responseFields);
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



