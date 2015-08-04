/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.customer.CustomerSegment;
import com.mozu.api.contracts.customer.CustomerAttribute;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.customer.CommerceSummary;
import com.mozu.api.contracts.customer.CustomerContact;
import com.mozu.api.contracts.customer.CurrencyAmount;
import com.mozu.api.contracts.customer.CustomerNote;

/**
 *	Properties of the customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerAccount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The legal or doing business as (DBA) or tradestyle name of the business or organization. The maximum character length is 200.
	 */
	protected String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	protected DateTime customerSinceDate;

	public DateTime getCustomerSinceDate() {
		return this.customerSinceDate;
	}

	public void setCustomerSinceDate(DateTime customerSinceDate) {
		this.customerSinceDate = customerSinceDate;
	}

	/**
	 * The email address for the customer account and contact. This email may be used for login to the storefront and for subscription mailing lists.
	 */
	protected String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Unique identifier used by an external program to identify a Mozu order, customer account, or wish list.
	 */
	protected String externalId;

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * The full first name of a customer or contact name.
	 */
	protected String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Indicates if an external password is set on this account
	 */
	protected Boolean hasExternalPassword;

	public Boolean getHasExternalPassword() {
		return this.hasExternalPassword;
	}

	public void setHasExternalPassword(Boolean hasExternalPassword) {
		this.hasExternalPassword = hasExternalPassword;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Indicates if the object or feature is active. This indicator is used for subscriptions (at the site or tenant level), customer accounts, products and variations.
	 */
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, this customer account represents an anonymous shopper.
	 */
	protected Boolean isAnonymous;

	public Boolean getIsAnonymous() {
		return this.isAnonymous;
	}

	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	/**
	 * Indicates if a customer account and associated data is locked. If true, the user account is locked due to multiple failed authentication attempts. The user cannot login until the account is unlocked.
	 */
	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * The full last name of a customer or contact name.
	 */
	protected String lastName;

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected DateTime lifeTimeValueSetDate;

	public DateTime getLifeTimeValueSetDate() {
		return this.lifeTimeValueSetDate;
	}

	public void setLifeTimeValueSetDate(DateTime lifeTimeValueSetDate) {
		this.lifeTimeValueSetDate = lifeTimeValueSetDate;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * If true, this customer account has tax exempt status.
	 */
	protected Boolean taxExempt;

	public Boolean getTaxExempt() {
		return this.taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
		this.taxExempt = taxExempt;
	}

	/**
	 * The tax identification number associated with the customer account.
	 */
	protected String taxId;

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * The user name associated with the user profile. The customer uses the user name to access the account.
	 */
	protected String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Indicates if the customer account is opted to receive marketing materials. If true, the customer account is opted in for receiving the content. 
	 */
	protected Boolean acceptsMarketing;

	public Boolean getAcceptsMarketing() {
		return this.acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	/**
	 * List of customer segments associated with the customer account. Customer accounts can be members of any number of segments.
	 */
	protected List<CustomerSegment> segments;
	public List<CustomerSegment> getSegments() {
		return this.segments;
	}
	public void setSegments(List<CustomerSegment> segments) {
		this.segments = segments;
	}

	/**
	 * Collection of attributes that may be paged list or a list, depending on the usage per object and API type. 
	 */
	protected List<CustomerAttribute> attributes;
	public List<CustomerAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<CustomerAttribute> attributes) {
		this.attributes = attributes;
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

	/**
	 * Properties of the commerce summary associated with a customer account, which includes details about the shopper's most recent order, wish lists, and total order value over time.
	 */
	protected CommerceSummary commerceSummary;

	public CommerceSummary getCommerceSummary() {
		return this.commerceSummary;
	}

	public void setCommerceSummary(CommerceSummary commerceSummary) {
		this.commerceSummary = commerceSummary;
	}

	/**
	 * Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 */
	protected List<CustomerContact> contacts;
	public List<CustomerContact> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<CustomerContact> contacts) {
		this.contacts = contacts;
	}

	protected CurrencyAmount lifetimeValue;

	public CurrencyAmount getLifetimeValue() {
		return this.lifetimeValue;
	}

	public void setLifetimeValue(CurrencyAmount lifetimeValue) {
		this.lifetimeValue = lifetimeValue;
	}

	/**
	 * Paged list collection of note content for objects including customers, orders, and returns. 
	 */
	protected List<CustomerNote> notes;
	public List<CustomerNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<CustomerNote> notes) {
		this.notes = notes;
	}

}
