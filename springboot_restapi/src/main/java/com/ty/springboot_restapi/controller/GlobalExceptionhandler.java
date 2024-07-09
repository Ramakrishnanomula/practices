package com.ty.springboot_restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ty.springboot_restapi.exception.IDNotfoundexception;
import com.ty.springboot_restapi.exception.MandatoryFieldMissingException;

	@RestControllerAdvice
	public class GlobalExceptionhandler {
		@ExceptionHandler
		@ResponseStatus(code=HttpStatus.NOT_FOUND)
		public String runtimeExceptionHandler(IDNotfoundexception ex)
		{
			return ex.getMessage();
			
		}
		@ExceptionHandler
		
		public ResponseEntity<String> mandatoryFieldMissingExceptionHandler(MandatoryFieldMissingException ex)
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
			
		}
		

	
}
