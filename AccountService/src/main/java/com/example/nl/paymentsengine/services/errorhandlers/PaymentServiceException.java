/**
 * This is Exception class for PaymentService Interface
 */
package com.example.nl.paymentsengine.services.errorhandlers;

import java.util.ArrayList;

/**
 * @author Shweta Nadkarni
 *
 */
@SuppressWarnings("serial")
public class PaymentServiceException extends Throwable {

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
