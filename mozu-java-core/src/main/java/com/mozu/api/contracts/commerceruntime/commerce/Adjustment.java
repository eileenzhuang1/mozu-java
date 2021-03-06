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

/**
 *	Properties of an ad-hoc price adjustment for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Adjustment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The amount of the order-level adjustment, which can be a positive or negative amount.
	 */
	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * The shopper-facing description of the order-level adjustment.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Administrator notes associated with the order adjustment. These comments are not shopper facing.
	 */
	protected String internalComment;

	public String getInternalComment() {
		return this.internalComment;
	}

	public void setInternalComment(String internalComment) {
		this.internalComment = internalComment;
	}

}
