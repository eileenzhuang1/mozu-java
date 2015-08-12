/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.settings.checkout;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerCheckoutSettingsUrl
{

	/**
	 * Get Resource Url for GetCustomerCheckoutSettings
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCustomerCheckoutSettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/customercheckoutsettings?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCustomerCheckoutSettings
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCustomerCheckoutSettingsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/settings/checkout/customercheckoutsettings?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
