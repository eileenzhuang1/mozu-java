/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.installedapplications;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.installedapplications.CustomFunction;

/**
 *	Mozu.InstalledApplications.Contracts.CustomFunctionsForContext ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFunctionsForContext implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.InstalledApplications.Contracts.CustomFunctionsForContext context ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer context;

	public Integer getContext() {
		return this.context;
	}

	public void setContext(Integer context) {
		this.context = context;
	}

	/**
	 * Mozu.InstalledApplications.Contracts.CustomFunctionsForContext customFunctions ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<CustomFunction> customFunctions;
	public List<CustomFunction> getCustomFunctions() {
		return this.customFunctions;
	}
	public void setCustomFunctions(List<CustomFunction> customFunctions) {
		this.customFunctions = customFunctions;
	}


}
