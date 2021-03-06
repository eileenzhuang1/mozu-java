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
import com.mozu.api.contracts.content.DocumentInstallation;
import com.mozu.api.contracts.content.View;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentListType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String documentListTypeFQN;

	public String getDocumentListTypeFQN() {
		return this.documentListTypeFQN;
	}

	public void setDocumentListTypeFQN(String documentListTypeFQN) {
		this.documentListTypeFQN = documentListTypeFQN;
	}

	protected List<String> documentTypeFQNs;
	public List<String> getDocumentTypeFQNs() {
		return this.documentTypeFQNs;
	}
	public void setDocumentTypeFQNs(List<String> documentTypeFQNs) {
		this.documentTypeFQNs = documentTypeFQNs;
	}

	protected Boolean enablePublishing;

	public Boolean getEnablePublishing() {
		return this.enablePublishing;
	}

	public void setEnablePublishing(Boolean enablePublishing) {
		this.enablePublishing = enablePublishing;
	}

	protected String installationPackage;

	public String getInstallationPackage() {
		return this.installationPackage;
	}

	public void setInstallationPackage(String installationPackage) {
		this.installationPackage = installationPackage;
	}

	protected String localizationType;

	public String getLocalizationType() {
		return this.localizationType;
	}

	public void setLocalizationType(String localizationType) {
		this.localizationType = localizationType;
	}

	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	protected String scopeType;

	public String getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	protected String security;

	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	protected Boolean supportsPublishing;

	public Boolean getSupportsPublishing() {
		return this.supportsPublishing;
	}

	public void setSupportsPublishing(Boolean supportsPublishing) {
		this.supportsPublishing = supportsPublishing;
	}

	protected List<String> usages;
	public List<String> getUsages() {
		return this.usages;
	}
	public void setUsages(List<String> usages) {
		this.usages = usages;
	}

	protected String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	protected List<DocumentInstallation> defaultDocuments;
	public List<DocumentInstallation> getDefaultDocuments() {
		return this.defaultDocuments;
	}
	public void setDefaultDocuments(List<DocumentInstallation> defaultDocuments) {
		this.defaultDocuments = defaultDocuments;
	}

	protected com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	protected List<View> views;
	public List<View> getViews() {
		return this.views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}

}
