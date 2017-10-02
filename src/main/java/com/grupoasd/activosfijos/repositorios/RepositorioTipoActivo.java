package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.TipoActivo;

/**
 * La interfaz RepositorioTipoActivo implementa el CRUD de la entidad TipoActivo
 */
@RepositoryRestResource(path = "tipoActivo", collectionResourceRel = "tipoActivo")
public interface RepositorioTipoActivo extends PagingAndSortingRepository<TipoActivo, Integer> {

}