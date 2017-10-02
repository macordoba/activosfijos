package com.grupoasd.activosfijos.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

/**
 * Entidad JPA ciudad.
 */
@Data
@Entity
@SequenceGenerator(name = "secuencia_Ciudad", sequenceName = "secuencia_Ciudad", allocationSize = 1)
@EqualsAndHashCode(callSuper = false)
public class Ciudad extends EntidadAuditable implements Serializable {

	/** id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_Ciudad")
	@Setter(value = AccessLevel.NONE)
	private Integer id;

	/** nombre. */
	private String nombre;

	/** areas. */
	@ManyToMany(mappedBy = "ciudades")
	@Setter(value = AccessLevel.NONE)
	private List<Area> areas;

	/** Constante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = 8180423550490241661L;

}