/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.orders;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Mozu.CommerceRuntime.Contracts.Orders.DigitalWallet ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DigitalWallet implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String cartId;

	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	/**
	 * Digital wallet data. Note: Transform the Json data to a string.
	 */
	protected String digitalWalletData;

	public String getDigitalWalletData() {
		return this.digitalWalletData;
	}

	public void setDigitalWalletData(String digitalWalletData) {
		this.digitalWalletData = digitalWalletData;
	}

}
