package com.grupoasd.activosfijos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Clase ServletInitializer configura el Servet en servidor para el aplicativo
 * web
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ActivosfijosApplication.class);
	}

}