/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.content.PropertyValue;

/**
 *	The document properties that define the content used by the content management system (CMS).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The character length associated with the document content.
	 */
	protected Long contentLength;

	public Long getContentLength() {
		return this.contentLength;
	}

	public void setContentLength(Long contentLength) {
		this.contentLength = contentLength;
	}

	/**
	 * The mime type associated with the document content, if applicable.
	 */
	protected String contentMimeType;

	public String getContentMimeType() {
		return this.contentMimeType;
	}

	public void setContentMimeType(String contentMimeType) {
		this.contentMimeType = contentMimeType;
	}

	/**
	 * The date and time the most recent content update was made. UTC date/time. System-supplied and read-only.
	 */
	protected DateTime contentUpdateDate;

	public DateTime getContentUpdateDate() {
		return this.contentUpdateDate;
	}

	public void setContentUpdateDate(DateTime contentUpdateDate) {
		this.contentUpdateDate = contentUpdateDate;
	}

	/**
	 * The name of the document list associated with the document.
	 */
	protected String documentListName;

	public String getDocumentListName() {
		return this.documentListName;
	}

	public void setDocumentListName(String documentListName) {
		this.documentListName = documentListName;
	}

	/**
	 * The type of document used in the CMS such as "web_page" or "template" or "image_url".
	 */
	protected String documentType;

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * If applicable, the file extension associated with the document content.
	 */
	protected String extension;

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * Unique identifier of the document.
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * When the document was added to the document list. System-supplied and read-only.
	 */
	protected DateTime insertDate;

	public DateTime getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(DateTime insertDate) {
		this.insertDate = insertDate;
	}

	/**
	 * The name of the document, which is unique within its folder.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The current state of the document, which is Active, Draft, or Latest. Active documents are published and cannot be deleted. Querying Latest returns the most recent version of the document, regardless of whether it is published or a draft.
	 */
	protected String publishState;

	public String getPublishState() {
		return this.publishState;
	}

	public void setPublishState(String publishState) {
		this.publishState = publishState;
	}

	/**
	 * Date and time when the entity was last updated, represented in UTC Date/Time.
	 */
	protected DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * List of properties for the given property value.
	 */
	protected List<PropertyValue> properties;
	public List<PropertyValue> getProperties() {
		return this.properties;
	}
	public void setProperties(List<PropertyValue> properties) {
		this.properties = properties;
	}

}
