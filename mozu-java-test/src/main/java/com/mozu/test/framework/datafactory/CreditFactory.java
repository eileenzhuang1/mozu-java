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
import com.mozu.api.resources.commerce.customer.CreditResource;

/** <summary>
 * Use the Customer Credits resource to manage the store credit associated with a customer account. Store credit can represent a static amount the customer can redeem at any of the tenant's sites, or a gift card registered for a customer account. At this time, gift card functionality is reserved for future use.
 * </summary>
 */
public class CreditFactory
{

	public static com.mozu.api.contracts.customer.credit.CreditCollection getCredits(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCredits(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.credit.CreditCollection getCredits(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.CreditCollection returnObj = new com.mozu.api.contracts.customer.credit.CreditCollection();
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			returnObj = resource.getCredits( startIndex,  pageSize,  sortBy,  filter,  responseFields);
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

	public static com.mozu.api.contracts.customer.credit.Credit getCredit(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getCredit(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.credit.Credit getCredit(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.Credit returnObj = new com.mozu.api.contracts.customer.credit.Credit();
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			returnObj = resource.getCredit( code,  responseFields);
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

	public static com.mozu.api.contracts.customer.credit.Credit addCredit(ApiContext apiContext, com.mozu.api.contracts.customer.credit.Credit credit, int expectedCode) throws Exception
	{
		return addCredit(apiContext,  credit,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.credit.Credit addCredit(ApiContext apiContext, com.mozu.api.contracts.customer.credit.Credit credit, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.Credit returnObj = new com.mozu.api.contracts.customer.credit.Credit();
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			returnObj = resource.addCredit( credit,  responseFields);
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

	public static com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return associateCreditToShopper(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.credit.Credit associateCreditToShopper(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.Credit returnObj = new com.mozu.api.contracts.customer.credit.Credit();
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			returnObj = resource.associateCreditToShopper( code,  responseFields);
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

	public static void resendCreditCreatedEmail(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			resource.resendCreditCreatedEmail( code);
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

	public static com.mozu.api.contracts.customer.credit.Credit updateCredit(ApiContext apiContext, com.mozu.api.contracts.customer.credit.Credit credit, String code, int expectedCode) throws Exception
	{
		return updateCredit(apiContext,  credit,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.customer.credit.Credit updateCredit(ApiContext apiContext, com.mozu.api.contracts.customer.credit.Credit credit, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.customer.credit.Credit returnObj = new com.mozu.api.contracts.customer.credit.Credit();
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			returnObj = resource.updateCredit( credit,  code,  responseFields);
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

	public static void deleteCredit(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		CreditResource resource = new CreditResource(apiContext);
		try
		{
			resource.deleteCredit( code);
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



