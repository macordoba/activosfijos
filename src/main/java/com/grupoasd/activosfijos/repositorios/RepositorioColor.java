package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.Color;

/**
 * La interfaz RepositorioColor implementa el CRUD de la entidad Color
 */
@RepositoryRestResource(path = "color", collectionResourceRel = "color")
public interface RepositorioColor extends PagingAndSortingRepository<Color, Integer> {

}