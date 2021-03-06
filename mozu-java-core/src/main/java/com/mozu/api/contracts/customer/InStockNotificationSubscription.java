/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a push notification to which the shopper subscribes. This notification sends the shopper an alert when a new product or a product previously out of stock becomes available in the specified location's active product inventory.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InStockNotificationSubscription implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the customer associated with the in-stock notification subscription.
	 */
	protected Integer customerId;

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * The email address of the specified user or the email address associated with the specified entity.
	 */
	protected String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Unique identifier of the customer in-stock notification subscription.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Tenant-defined code that identifies the customer in-stock notification subscription.
	 */
	protected String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
