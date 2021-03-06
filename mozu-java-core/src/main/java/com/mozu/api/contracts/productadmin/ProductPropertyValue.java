/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent;

/**
 *	Value details for a product property attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPropertyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Value details for a product property attribute.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * Details of the vocabulary value for predefined product property attributes.
	 */
	protected AttributeVocabularyValue attributeVocabularyValueDetail;

	public AttributeVocabularyValue getAttributeVocabularyValueDetail() {
		return this.attributeVocabularyValueDetail;
	}

	public void setAttributeVocabularyValueDetail(AttributeVocabularyValue attributeVocabularyValueDetail) {
		this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
	}

	/**
	 * Content of the product property value.
	 */
	protected ProductPropertyValueLocalizedContent content;

	public ProductPropertyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductPropertyValueLocalizedContent content) {
		this.content = content;
	}

	protected List<ProductPropertyValueLocalizedContent> localizedContent;
	public List<ProductPropertyValueLocalizedContent> getLocalizedContent() {
		return this.localizedContent;
	}
	public void setLocalizedContent(List<ProductPropertyValueLocalizedContent> localizedContent) {
		this.localizedContent = localizedContent;
	}

}
