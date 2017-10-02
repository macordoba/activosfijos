package com.grupoasd.activosfijos.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grupoasd.activosfijos.manejadoreventos.ActivoFijoEventHandler;

/**
 * La RepositoryConfiguration agrega la clase que realiza la validacion de las
 * fechas en la entidad activo fijo
 */
@Configuration
public class RepositoryConfiguration {

	/**
	 * Activo fijo event handler.
	 *
	 * @return the activo fijo event handler
	 */
	@Bean
	ActivoFijoEventHandler activoFijoEventHandler() {
		return new ActivoFijoEventHandler();
	}

}