/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.mzdb;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Data for indexed properties within the database.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndexedProperty implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected  String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * A JPath query indicating the property that should be indexed to enable querying and sorting.  Non-indexed properties may be used in queries as long as at least one indexed property is also provided in the query.
	 */
	protected  String propertyName;

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}


}
