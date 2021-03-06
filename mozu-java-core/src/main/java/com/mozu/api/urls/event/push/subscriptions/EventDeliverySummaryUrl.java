/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.event.push.subscriptions;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class EventDeliverySummaryUrl
{

	/**
	 * Get Resource Url for GetDeliveryAttemptSummary
	 * @param id This parameter is the unique identifer for an event attempt delivery summary.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param subscriptionId This operation paramenter is the unique identifer for a subscription.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDeliveryAttemptSummaryUrl(Integer id, String responseFields, String subscriptionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/event/push/subscriptions/{subscriptionId}/deliveryattempts/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("subscriptionId", subscriptionId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDeliveryAttemptSummaries
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param subscriptionId 
	 * @return   String Resource Url
	 */
	public static MozuUrl getDeliveryAttemptSummariesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex, String subscriptionId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/event/push/subscriptions/{subscriptionId}/deliveryattempts?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		formatter.formatUrl("subscriptionId", subscriptionId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

