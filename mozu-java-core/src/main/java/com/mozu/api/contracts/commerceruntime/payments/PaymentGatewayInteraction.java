/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of an interaction with the payment gateway.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentGatewayInteraction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If required by the payment gateway, the authorization code of the transaction.
	 */
	protected  String gatewayAuthCode;

	public String getGatewayAuthCode() {
		return this.gatewayAuthCode;
	}

	public void setGatewayAuthCode(String gatewayAuthCode) {
		this.gatewayAuthCode = gatewayAuthCode;
	}

	/**
	 * AVS (Address Verification Service) codes supplied by the payment gateway. The codes indicate partial to complete or failed matches against the billing address for the shopper against the financial institute data through the gateway.
	 */
	protected  String gatewayAVSCodes;

	public String getGatewayAVSCodes() {
		return this.gatewayAVSCodes;
	}

	public void setGatewayAVSCodes(String gatewayAVSCodes) {
		this.gatewayAVSCodes = gatewayAVSCodes;
	}

	/**
	 * CVV2 (Card Verification Value) codes supplied by the payment gateway. The codes indicate a verified or failed match of the encrypted code entered against the financial institution data through the gateway.
	 */
	protected  String gatewayCVV2Codes;

	public String getGatewayCVV2Codes() {
		return this.gatewayCVV2Codes;
	}

	public void setGatewayCVV2Codes(String gatewayCVV2Codes) {
		this.gatewayCVV2Codes = gatewayCVV2Codes;
	}

	/**
	 * Unique identifier of the payment interaction from the payment gateway.
	 */
	protected  Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	/**
	 * Response code from the gateway associated with the payment interaction. For example, if the gateway returns "Not Authorized," an interaction for voiding the payment transaction would result.
	 */
	protected  String gatewayResponseCode;

	public String getGatewayResponseCode() {
		return this.gatewayResponseCode;
	}

	public void setGatewayResponseCode(String gatewayResponseCode) {
		this.gatewayResponseCode = gatewayResponseCode;
	}

	/**
	 * Textual message returned by the payment gateway for the associated success or failure code.
	 */
	protected  String gatewayResponseText;

	public String getGatewayResponseText() {
		return this.gatewayResponseText;
	}

	public void setGatewayResponseText(String gatewayResponseText) {
		this.gatewayResponseText = gatewayResponseText;
	}

	/**
	 * Unique identifier of the gateway transaction associated with the payment interaction.
	 */
	protected  String gatewayTransactionId;

	public String getGatewayTransactionId() {
		return this.gatewayTransactionId;
	}

	public void setGatewayTransactionId(String gatewayTransactionId) {
		this.gatewayTransactionId = gatewayTransactionId;
	}


}
