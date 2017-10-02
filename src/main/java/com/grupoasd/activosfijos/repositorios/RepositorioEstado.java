package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.Estado;

/**
 * La interfaz RepositorioEstado implementa el CRUD de la entidad Estado
 */
@RepositoryRestResource(path = "estado", collectionResourceRel = "estado")
public interface RepositorioEstado extends PagingAndSortingRepository<Estado, Integer> {

}