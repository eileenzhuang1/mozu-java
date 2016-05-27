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
import com.mozu.api.contracts.productadmin.CategoryLocalizedImage;

/**
 *	The container for category properties that are shown in the language specified by the locale code.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryLocalizedContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected  String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected  String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	/**
	 * Description defined for metadata, used to interally manage data, in the language specified by the `localeCode`. This content is used by categories, products, localized content, and SEO content.
	 */
	protected  String metaTagDescription;

	public String getMetaTagDescription() {
		return this.metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	/**
	 * Keywords defined for  metadata, used to internally manage data, in the language specified by the `localeCode`. Keywords are used by content for categories, products, localized content, and SEO content.
	 */
	protected  String metaTagKeywords;

	public String getMetaTagKeywords() {
		return this.metaTagKeywords;
	}

	public void setMetaTagKeywords(String metaTagKeywords) {
		this.metaTagKeywords = metaTagKeywords;
	}

	/**
	 * Title defined for  metadata, used to internally manage data, in the language specified by the `localeCode`. Titles are used by content for categories, products, localized content, and SEO content.
	 */
	protected  String metaTagTitle;

	public String getMetaTagTitle() {
		return this.metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
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
	 * Title that appears on new product category pages, in the language specified by the `localeCode`.
	 */
	protected  String pageTitle;

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	/**
	 * Slug is used in place of a name, code, or ID to give an SEO, human-friendly URL link for an object, used by categories.
	 */
	protected  String slug;

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Array list of media images associated to a product category. These images may be localized in the language specified by the LocaleCode. Images display with the category on the storefront according to the code and formatting of your site theme. Each image includes the name, alt text, and URL location.
	 */
	protected List<CategoryLocalizedImage> categoryImages;
	public List<CategoryLocalizedImage> getCategoryImages() {
		return this.categoryImages;
	}
	public void setCategoryImages(List<CategoryLocalizedImage> categoryImages) {
		this.categoryImages = categoryImages;
	}


}
