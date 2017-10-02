package com.grupoasd.activosfijos.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

/**
 * Entidad JPA color.
 */
@Data
@Entity
@SequenceGenerator(name = "secuencia_Color", sequenceName = "secuencia_Color", allocationSize = 1)
@EqualsAndHashCode(callSuper = false)
public class Color extends EntidadAuditable implements Serializable {

	/** id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_Color")
	@Setter(value = AccessLevel.NONE)
	private Integer id;

	/** nombre. */
	private String nombre;

	/** Constante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = 2291681193000723279L;

}