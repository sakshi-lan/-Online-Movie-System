package com.cap.exception;

public class InvalidPhoneNumberException extends RuntimeException {

	public InvalidPhoneNumberException(String error_Msg) {
		super(error_Msg);
	}
}

