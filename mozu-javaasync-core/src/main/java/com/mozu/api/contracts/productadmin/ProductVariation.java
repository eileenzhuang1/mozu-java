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
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice;
import com.mozu.api.contracts.productadmin.ProductVariationFixedPrice;
import com.mozu.api.contracts.productadmin.ProductVariationOption;
import com.mozu.api.contracts.productadmin.ProductSupplierInfo;

/**
 *	Properties of a specific product variation.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVariation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The difference between the weight associated with this product, variation option, or extra and the base product. For example, if a product with a monogram weighs an extra 1/4 lb, the DeltaWeight value is "0.25". The amount of the delta is set by the weight type for the storefront.
	 */
	protected  Double deltaWeight;

	public Double getDeltaWeight() {
		return this.deltaWeight;
	}

	public void setDeltaWeight(Double deltaWeight) {
		this.deltaWeight = deltaWeight;
	}

	/**
	 * Fixed weight of the product with this variation.
	 */
	protected  Double fixedWeight;

	public Double getFixedWeight() {
		return this.fixedWeight;
	}

	public void setFixedWeight(Double fixedWeight) {
		this.fixedWeight = fixedWeight;
	}

	/**
	 * List of supported types of fulfillment  for the product or variation. The types include direct ship, in-store pickup, or both. 
	 */
	protected List<String> fulfillmentTypesSupported;
	public List<String> getFulfillmentTypesSupported() {
		return this.fulfillmentTypesSupported;
	}
	public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
		this.fulfillmentTypesSupported = fulfillmentTypesSupported;
	}

	/**
	 * Indicates if the object or feature is active. This indicator is used for subscriptions (at the site or tenant level), customer accounts, products and variations.
	 */
	protected  Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * If true, the production variation is no longer available for sale. For example, if a client stops selling all "small" shirts, all product variations with the "small" option are set to IsOrphan. System-supplied and read only.
	 */
	protected  Boolean isOrphan;

	public Boolean getIsOrphan() {
		return this.isOrphan;
	}

	public void setIsOrphan(Boolean isOrphan) {
		this.isOrphan = isOrphan;
	}

	/**
	 * The universal product code (UPC) is the barcode defined for the product. The UPC is unique across all sales channels. 
	 */
	protected  String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * If true, one or more product variations are configured for the specified product code.
	 */
	protected  Boolean variationExists;

	public Boolean getVariationExists() {
		return this.variationExists;
	}

	public void setVariationExists(Boolean variationExists) {
		this.variationExists = variationExists;
	}

	/**
	 * System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 */
	protected  String variationkey;

	public String getVariationkey() {
		return this.variationkey;
	}

	public void setVariationkey(String variationkey) {
		this.variationkey = variationkey;
	}

	/**
	 * Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 */
	protected  String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	/**
	 * The difference between associated prices for a product, variation option, or extra. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. For example, if a product with a defined monogram extra costs an additional $10, the `deltaPrice `value is "10". Between options, a price for a medium may be $10 and a large $12 giving a `deltaPrice `value of "2".
	 */
	protected  ProductVariationDeltaPrice deltaPrice;

	public ProductVariationDeltaPrice getDeltaPrice() {
		return this.deltaPrice;
	}

	public void setDeltaPrice(ProductVariationDeltaPrice deltaPrice) {
		this.deltaPrice = deltaPrice;
	}

	/**
	 * Price of the variation using fixed price
	 */
	protected  ProductVariationFixedPrice fixedPrice;

	public ProductVariationFixedPrice getFixedPrice() {
		return this.fixedPrice;
	}

	public void setFixedPrice(ProductVariationFixedPrice fixedPrice) {
		this.fixedPrice = fixedPrice;
	}

	/**
	 * The difference between associated prices for a product, variation option, or extra that is localized per the `localeCode`. The difference is calculated by subtracting the base price from the associated price with this product, option, and/or extra. Depending on the localeCode, the price may be converted such as from USD (US Dollar) to EUR (euro).
	 */
	protected List<ProductVariationDeltaPrice> localizedDeltaPrice;
	public List<ProductVariationDeltaPrice> getLocalizedDeltaPrice() {
		return this.localizedDeltaPrice;
	}
	public void setLocalizedDeltaPrice(List<ProductVariationDeltaPrice> localizedDeltaPrice) {
		this.localizedDeltaPrice = localizedDeltaPrice;
	}

	/**
	 * Price of the variation using fixed per currency This collection allows for multiple currencies.
	 */
	protected List<ProductVariationFixedPrice> localizedFixedPrice;
	public List<ProductVariationFixedPrice> getLocalizedFixedPrice() {
		return this.localizedFixedPrice;
	}
	public void setLocalizedFixedPrice(List<ProductVariationFixedPrice> localizedFixedPrice) {
		this.localizedFixedPrice = localizedFixedPrice;
	}

	/**
	 * List of option attributes configured for an object. These values are associated and used by products, product bundles, and product types.
	 */
	protected List<ProductVariationOption> options;
	public List<ProductVariationOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductVariationOption> options) {
		this.options = options;
	}

	/**
	 * Supplier-defined properties assigned for the product.
	 */
	protected  ProductSupplierInfo supplierInfo;

	public ProductSupplierInfo getSupplierInfo() {
		return this.supplierInfo;
	}

	public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
		this.supplierInfo = supplierInfo;
	}


}
