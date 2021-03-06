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
import com.mozu.api.resources.content.DocumentListResource;

/** <summary>
 * Use the document lists resource to organize your site's documents into a hierarchy. Document lists can contain documents, folders, and complete hierarchies of folders, which contain documents with unique names.
 * </summary>
 */
public class DocumentListFactory
{

	public static com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, int expectedCode, int successCode) throws Exception
	{
		return getDocumentLists(apiContext, dataViewMode,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListCollection returnObj = new com.mozu.api.contracts.content.DocumentListCollection();
		DocumentListResource resource = new DocumentListResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocumentLists( pageSize,  startIndex,  responseFields);
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

	public static com.mozu.api.contracts.content.DocumentList getDocumentList(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, int expectedCode, int successCode) throws Exception
	{
		return getDocumentList(apiContext, dataViewMode,  documentListName,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentList getDocumentList(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String documentListName, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentList returnObj = new com.mozu.api.contracts.content.DocumentList();
		DocumentListResource resource = new DocumentListResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getDocumentList( documentListName,  responseFields);
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

	public static com.mozu.api.contracts.content.DocumentList createDocumentList(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentList list, int expectedCode, int successCode) throws Exception
	{
		return createDocumentList(apiContext, dataViewMode,  list,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentList createDocumentList(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentList list, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentList returnObj = new com.mozu.api.contracts.content.DocumentList();
		DocumentListResource resource = new DocumentListResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.createDocumentList( list,  responseFields);
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

	public static com.mozu.api.contracts.content.DocumentList updateDocumentList(ApiContext apiContext, com.mozu.api.contracts.content.DocumentList list, String documentListName, int expectedCode, int successCode) throws Exception
	{
		return updateDocumentList(apiContext,  list,  documentListName,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentList updateDocumentList(ApiContext apiContext, com.mozu.api.contracts.content.DocumentList list, String documentListName, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentList returnObj = new com.mozu.api.contracts.content.DocumentList();
		DocumentListResource resource = new DocumentListResource(apiContext);
		try
		{
			returnObj = resource.updateDocumentList( list,  documentListName,  responseFields);
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

	public static void deleteDocumentList(ApiContext apiContext, String documentListName, int expectedCode, int successCode) throws Exception
	{
		DocumentListResource resource = new DocumentListResource(apiContext);
		try
		{
			resource.deleteDocumentList( documentListName);
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



