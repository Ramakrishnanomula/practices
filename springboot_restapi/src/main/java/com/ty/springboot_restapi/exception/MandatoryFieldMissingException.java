package com.ty.springboot_restapi.exception;

public class MandatoryFieldMissingException  extends RuntimeException  {
	private static final long serialVersionUID=1L;
	private String message="id Not Found Exception";
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this .message=message;
	}
	public  MandatoryFieldMissingException (String message) {
		super();
		this.message=message;
	}
	@Override
	public String toString() {
		return "MandatoryFieldMissingException [message=" + message + "]";
	}
	
}
