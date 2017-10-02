package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.Ciudad;

/**
 * La interfaz RepositorioCiudad implementa el CRUD de la entidad Ciudad
 */
@RepositoryRestResource(path = "ciudad", collectionResourceRel = "ciudad")
public interface RepositorioCiudad extends PagingAndSortingRepository<Ciudad, Integer> {

}