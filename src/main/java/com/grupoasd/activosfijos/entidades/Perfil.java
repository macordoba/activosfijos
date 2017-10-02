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
 * Entidad JPA perfil.
 */
@Data
@Entity
@SequenceGenerator(name = "secuencia_Perfil", sequenceName = "secuencia_Perfil", allocationSize = 1)
@EqualsAndHashCode(callSuper = false)
public class Perfil extends EntidadAuditable implements Serializable {

	/** id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_Perfil")
	@Setter(value = AccessLevel.NONE)
	private Integer id;

	/** nombre. */
	private String nombre;

	/** Constante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -7376415533863297536L;
}