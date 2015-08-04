/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Define global site settings such as the site name, shipping and email addresses, and logo images. Block undesirable IP addresses using this resource.
 * </summary>
 */
public class GeneralSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public GeneralSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve a site's general global settings.
	 * <p><pre><code>
	 *	GeneralSettings generalsettings = new GeneralSettings();
	 *	GeneralSettings generalSettings = generalsettings.getGeneralSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.GeneralSettings getGeneralSettings() throws Exception
	{
		return getGeneralSettings( null);
	}

	/**
	 * Retrieve a site's general global settings.
	 * <p><pre><code>
	 *	GeneralSettings generalsettings = new GeneralSettings();
	 *	GeneralSettings generalSettings = generalsettings.getGeneralSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.GeneralSettings getGeneralSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> client = com.mozu.api.clients.commerce.settings.GeneralSettingsClient.getGeneralSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a site's general global settings.
	 * <p><pre><code>
	 *	GeneralSettings generalsettings = new GeneralSettings();
	 *	GeneralSettings generalSettings = generalsettings.updateGeneralSettings( generalSettings);
	 * </code></pre></p>
	 * @param generalSettings General settings used on the storefront site.
	 * @return com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.GeneralSettings updateGeneralSettings(com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings) throws Exception
	{
		return updateGeneralSettings( generalSettings,  null);
	}

	/**
	 * Updates a site's general global settings.
	 * <p><pre><code>
	 *	GeneralSettings generalsettings = new GeneralSettings();
	 *	GeneralSettings generalSettings = generalsettings.updateGeneralSettings( generalSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param generalSettings General settings used on the storefront site.
	 * @return com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 * @see com.mozu.api.contracts.sitesettings.general.GeneralSettings
	 */
	public com.mozu.api.contracts.sitesettings.general.GeneralSettings updateGeneralSettings(com.mozu.api.contracts.sitesettings.general.GeneralSettings generalSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.general.GeneralSettings> client = com.mozu.api.clients.commerce.settings.GeneralSettingsClient.updateGeneralSettingsClient( generalSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



