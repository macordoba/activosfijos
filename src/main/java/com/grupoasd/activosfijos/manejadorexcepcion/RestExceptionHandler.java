package com.grupoasd.activosfijos.manejadorexcepcion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.grupoasd.activosfijos.excepciones.ActivoFijoException;
import com.grupoasd.activosfijos.excepciones.ResponseError;

/**
 * La clase RestExceptionHandler Maneja error ActivoFijoException 
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Maneja error ActivoFijoException
	 *
	 * @param ex
	 *            Error
	 * @return ResponseEntity
	 */
	@ExceptionHandler(ActivoFijoException.class)
	protected ResponseEntity<Object> handleEntityNotFound(ActivoFijoException ex) {
		ResponseError error = new ResponseError();
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		error.setMessage(ex.getMessage());
		return buildResponseEntity(error);
	}

	/**
	 * Construye la respuesta del error.
	 *
	 * @param error
	 *            error
	 * @return ResponseEntity
	 */
	private ResponseEntity<Object> buildResponseEntity(ResponseError error) {
		return new ResponseEntity<>(error, error.getStatus());
	}

}