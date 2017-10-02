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
 * Entidad JPA estado.
 */
@Data
@Entity
@SequenceGenerator(name = "secuencia_Estado", sequenceName = "secuencia_Estado", allocationSize = 1)
@EqualsAndHashCode(callSuper = false)
public class Estado extends EntidadAuditable implements Serializable {

	/** id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_Estado")
	@Setter(value = AccessLevel.NONE)
	private Integer id;

	/** nombre. */
	private String nombre;

	/** Constante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -1792179145307445522L;

}