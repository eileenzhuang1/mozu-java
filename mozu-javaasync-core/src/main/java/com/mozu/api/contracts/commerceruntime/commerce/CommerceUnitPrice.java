/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.commerce;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Pricing details for a product in a cart or an order, including the original price, discount amount, and final price.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommerceUnitPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Represents the total price of the line item extended to the shopper. This begins with the Unit Price, then uses any of the following prices if they are defined, in the following order: Override Amount, Sale Amount, List Amount.
	 */
	protected  Double extendedAmount;

	public Double getExtendedAmount() {
		return this.extendedAmount;
	}

	public void setExtendedAmount(Double extendedAmount) {
		this.extendedAmount = extendedAmount;
	}

	/**
	 * The price the item is listed for in the storefront.
	 */
	protected  Double listAmount;

	public Double getListAmount() {
		return this.listAmount;
	}

	public void setListAmount(Double listAmount) {
		this.listAmount = listAmount;
	}

	/**
	 * The override price of the item set by the merchant for a given order.
	 */
	protected  Double overrideAmount;

	public Double getOverrideAmount() {
		return this.overrideAmount;
	}

	public void setOverrideAmount(Double overrideAmount) {
		this.overrideAmount = overrideAmount;
	}

	/**
	 * The sale price set for the item.
	 */
	protected  Double saleAmount;

	public Double getSaleAmount() {
		return this.saleAmount;
	}

	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}


}
