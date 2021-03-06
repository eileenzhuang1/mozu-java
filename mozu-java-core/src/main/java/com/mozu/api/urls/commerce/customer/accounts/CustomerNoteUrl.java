/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer.accounts;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerNoteUrl
{

	/**
	 * Get Resource Url for GetAccountNote
	 * @param accountId Unique identifier of the customer account that contains the note being retrieved.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountNoteUrl(Integer accountId, Integer noteId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/notes/{noteId}?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAccountNotes
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAccountNotesUrl(Integer accountId, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/notes?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAccountNote
	 * @param accountId Unique identifier of the customer account for which to create the note.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAccountNoteUrl(Integer accountId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/notes?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAccountNote
	 * @param accountId Unique identifier of the customer account note to modify.
	 * @param noteId Unique identifier of the note to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAccountNoteUrl(Integer accountId, Integer noteId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/notes/{noteId}?responseFields={responseFields}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("noteId", noteId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAccountNote
	 * @param accountId Unique identifier of the customer account that contains the note being deleted.
	 * @param noteId Unique identifier of the customer account note being deleted.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAccountNoteUrl(Integer accountId, Integer noteId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/accounts/{accountId}/notes/{noteId}");
		formatter.formatUrl("accountId", accountId);
		formatter.formatUrl("noteId", noteId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

