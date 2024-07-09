package com.ty.springboot_restapi.exception;

public class IDNotfoundexception extends  RuntimeException {

private static final long serialVersionUID=1L;
private String message="id Not Found Exception";
public IDNotfoundexception (String message)
{
	super();
	this.message=message;
}

public String getMessage()
{
	return message;
}
public void setMessage(String message)
{
	this.message=message;
}
@Override
public String toString() {
	return "IDNotfoundexception [message=" + message + "]";
}
}
