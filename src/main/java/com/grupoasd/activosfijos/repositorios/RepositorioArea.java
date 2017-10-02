package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.Area;

/**
 * La interfaz RepositorioArea implementa el CRUD de la entidad Area
 */
@RepositoryRestResource(path = "area", collectionResourceRel = "area")
public interface RepositorioArea extends PagingAndSortingRepository<Area, Integer> {

}