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
import com.mozu.api.resources.commerce.catalog.admin.products.ProductPropertyResource;

/** <summary>
 * Use the Properties resource to configure a property attribute for an individual product associated with a product type that uses the property attribute, as well as set property values for the product.
 * </summary>
 */
public class ProductPropertyFactory
{

	public static List<com.mozu.api.contracts.productadmin.ProductProperty> getProperties(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductProperty> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductProperty>();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProperties( productCode);
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

	public static List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> getPropertyValueLocalizedContents(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getPropertyValueLocalizedContents( productCode,  attributeFQN,  value);
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

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent getPropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode, int expectedCode, int successCode) throws Exception
	{
		return getPropertyValueLocalizedContent(apiContext, dataViewMode,  productCode,  attributeFQN,  value,  localeCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent getPropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getPropertyValueLocalizedContent( productCode,  attributeFQN,  value,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductProperty getProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return getProperty(apiContext, dataViewMode,  productCode,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductProperty getProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductProperty returnObj = new com.mozu.api.contracts.productadmin.ProductProperty();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.getProperty( productCode,  attributeFQN,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent addPropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
		return addPropertyValueLocalizedContent(apiContext, dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent addPropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addPropertyValueLocalizedContent( localizedContent,  productCode,  attributeFQN,  value,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductProperty addProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, int expectedCode, int successCode) throws Exception
	{
		return addProperty(apiContext, dataViewMode,  productProperty,  productCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductProperty addProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductProperty returnObj = new com.mozu.api.contracts.productadmin.ProductProperty();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.addProperty( productProperty,  productCode,  responseFields);
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

	public static List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> updatePropertyValueLocalizedContents(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> localizedContent, String productCode, String attributeFQN, String value, int expectedCode, int successCode) throws Exception
	{
		List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> returnObj = new ArrayList<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updatePropertyValueLocalizedContents( localizedContent,  productCode,  attributeFQN,  value);
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

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent updatePropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String localeCode, int expectedCode, int successCode) throws Exception
	{
		return updatePropertyValueLocalizedContent(apiContext, dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  localeCode,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent updatePropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String localeCode, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent returnObj = new com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updatePropertyValueLocalizedContent( localizedContent,  productCode,  attributeFQN,  value,  localeCode,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.ProductProperty updateProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		return updateProperty(apiContext, dataViewMode,  productProperty,  productCode,  attributeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductProperty updateProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String attributeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductProperty returnObj = new com.mozu.api.contracts.productadmin.ProductProperty();
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.updateProperty( productProperty,  productCode,  attributeFQN,  responseFields);
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

	public static void deleteProperty(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, int expectedCode, int successCode) throws Exception
	{
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			resource.deleteProperty( productCode,  attributeFQN);
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

	public static void deletePropertyValueLocalizedContent(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode, int expectedCode, int successCode) throws Exception
	{
		ProductPropertyResource resource = new ProductPropertyResource(apiContext, dataViewMode);
		try
		{
			resource.deletePropertyValueLocalizedContent( productCode,  attributeFQN,  value,  localeCode);
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



