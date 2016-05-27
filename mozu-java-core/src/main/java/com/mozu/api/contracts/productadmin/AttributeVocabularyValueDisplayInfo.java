/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Provides the display information for attribute vocabulary values. 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeVocabularyValueDisplayInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The identifier of the image in the Mozu CMS. Supply a value for either the CMS ID or Image URL parameter.
	 */
	protected  String cmsId;

	public String getCmsId() {
		return this.cmsId;
	}

	public void setCmsId(String cmsId) {
		this.cmsId = cmsId;
	}

	/**
	 * Hex value for a color to display in a color picker. This is an HTML supported code for color.
	 */
	protected  String colorValue;

	public String getColorValue() {
		return this.colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	/**
	 * The URL link for the image file associated with a product or category.
	 */
	protected  String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


}
