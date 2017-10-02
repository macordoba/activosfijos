package com.grupoasd.activosfijos.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.grupoasd.activosfijos.repositorios.RepositorioInternacionalizacion;

/**
 * La clases InternacionalizacionProcessor integra el servicio REST de
 * internacionalizacion a la API de servicio de la aplicacion
 */
@Configuration
public class InternacionalizacionProcessor implements ResourceProcessor<RepositoryLinksResource> {

	@Override
	public RepositoryLinksResource process(RepositoryLinksResource resource) {
		resource.add(ControllerLinkBuilder.linkTo(RepositorioInternacionalizacion.class)
				.slash("/api/internacionalizacion/idioma").withRel("internacionalizacion"));
		return resource;
	}
}