package com.grupoasd.activosfijos.excepciones;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ResponseError {

	/** status. */
	private HttpStatus status;

	/** timestamp. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Timestamp timestamp;

	/** message. */
	private String message;

	/**
	 * Constructor de ResponseErrorr.
	 */
	public ResponseError() {
		super();
		timestamp = new Timestamp(new java.util.Date().getTime());
	}

}