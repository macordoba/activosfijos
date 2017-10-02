package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.grupoasd.activosfijos.entidades.Persona;

/**
 * La interfaz RepositorioPersona implementa el CRUD de la entidad Persona
 */
@RepositoryRestResource(path = "usuario", collectionResourceRel = "usuario")
public interface RepositorioPersona extends PagingAndSortingRepository<Persona, Integer> {

	/**
	 * Buscar por correo.
	 *
	 * @param correo
	 *            correo
	 * @return persona
	 */
	@RestResource(path = "correo", rel = "correo")
	public Persona findByCorreo(@Param("correo") String correo);

}