/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	The 2-letter code and corresponding country name that the system supports.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 */
	protected  String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
