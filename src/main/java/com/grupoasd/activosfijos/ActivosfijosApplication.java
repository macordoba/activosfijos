package com.grupoasd.activosfijos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Backend de la aplicación para la gestión de activos fijos.
 *
 * @author Alvaro Cordoba
 * @version 1.0
 * @since 2017-10-02
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.grupoasd.activosfijos.repositorios")
@PropertySource(ignoreResourceNotFound = true, value = "file:./var/properties/activosfijos.properties")
public class ActivosfijosApplication {

	/** Constante logger */
	private static final Logger logger = LogManager.getLogger(ActivosfijosApplication.class);

	/**
	 * Método principal del aplicativo donde se inicia el contexto Spring.
	 *
	 * @param args parametros de entrada tipo String.
	 */

	public static void main(String[] args) {
		SpringApplication.run(ActivosfijosApplication.class, args);
		logger.info("Aplicacion iniciada...");
	}

}