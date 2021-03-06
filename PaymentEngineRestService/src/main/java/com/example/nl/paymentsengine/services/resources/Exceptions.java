/**
 * 
 */
package com.example.nl.paymentsengine.services.resources;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author Shweta Nadkarni
 *
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
"errorMessages",
"warningMessages",
"infoMessages"
})
@XmlRootElement
public class Exceptions {
	
	private ArrayList<String> errorMessages;
	
	private ArrayList<String> warningMessages;
	
	private ArrayList<String> infoMessages;
	

	public ArrayList<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(ArrayList<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public ArrayList<String> getWarningMessages() {
		return warningMessages;
	}

	public void setWarningMessages(ArrayList<String> warningMessages) {
		this.warningMessages = warningMessages;
	}

	public ArrayList<String> getInfoMessages() {
		return infoMessages;
	}

	public void setInfoMessages(ArrayList<String> infoMessages) {
		this.infoMessages = infoMessages;
	}
	

}
