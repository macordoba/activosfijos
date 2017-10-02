package com.grupoasd.activosfijos.excepciones;

/**
 * La clase ActivoFijoException es una excepcion propia del aplicativo.
 */
public class ActivoFijoException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2839892869752797983L;

	/**
	 * constructor de ActivoFijoException.
	 *
	 * @param message
	 *            message
	 */
	public ActivoFijoException(String message) {
		super(message);
	}

}