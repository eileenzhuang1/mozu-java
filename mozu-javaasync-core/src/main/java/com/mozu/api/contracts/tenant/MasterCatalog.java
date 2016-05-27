/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.tenant;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.tenant.Catalog;

/**
 *	Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterCatalog implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The date time in UTC format set when the object was created. 
	 */
	protected  DateTime createDate;

	public DateTime getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * The default three-letter ISO currency code for monetary amounts. Currently, only "USD" is supported for U.S. Dollar.
	 */
	protected  String defaultCurrencyCode;

	public String getDefaultCurrencyCode() {
		return this.defaultCurrencyCode;
	}

	public void setDefaultCurrencyCode(String defaultCurrencyCode) {
		this.defaultCurrencyCode = defaultCurrencyCode;
	}

	/**
	 * The two-letter default locale code for setting the localized text content. Currently, only "en-US" is supported for U.S. English.
	 */
	protected  String defaultLocaleCode;

	public String getDefaultLocaleCode() {
		return this.defaultLocaleCode;
	}

	public void setDefaultLocaleCode(String defaultLocaleCode) {
		this.defaultLocaleCode = defaultLocaleCode;
	}

	/**
	 * The date and time the object was deleted. 
	 */
	protected  DateTime deleteDate;

	public DateTime getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(DateTime deleteDate) {
		this.deleteDate = deleteDate;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object is deleted. If true, the object has been deleted. This may affect associated child members and objects. For example, a deleted master catalog affects all associated catalogs. 
	 */
	protected  Boolean isDeleted;

	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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

	/**
	 * The current status of an object. This status is specific to the object including payment (New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack), discount (Active, Scheduled, or Expired), returns (ReturnAuthorized), tenant, package (Fulfilled or NotFulfilled), application, master and product catalogs, orders (Pending, Submitted, Processing, Pending Review, Closed, or Canceled), and order validation results (Pass, Fail, Error, or Review).
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected  Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * The date and time the object was updated most recently. The date is in UTC format.
	 */
	protected  DateTime updateDate;

	public DateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Collection of product catalogs that use product definitions from the master catalog.
	 */
	protected List<Catalog> catalogs;
	public List<Catalog> getCatalogs() {
		return this.catalogs;
	}
	public void setCatalogs(List<Catalog> catalogs) {
		this.catalogs = catalogs;
	}


}
