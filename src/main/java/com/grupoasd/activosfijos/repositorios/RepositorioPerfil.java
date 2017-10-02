package com.grupoasd.activosfijos.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grupoasd.activosfijos.entidades.Perfil;

/**
 * La interfaz RepositorioPerfil implementa el CRUD de la entidad Perfil
 */
@RepositoryRestResource(path = "perfil", collectionResourceRel = "perfil")
public interface RepositorioPerfil extends PagingAndSortingRepository<Perfil, Integer> {

}