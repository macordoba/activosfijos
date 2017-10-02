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
 * Entidad JPA area.
 */
@Data
@Entity
@SequenceGenerator(name = "secuencia_Area", sequenceName = "secuencia_Area", allocationSize = 1)
@EqualsAndHashCode(callSuper = false)
public class Area extends EntidadAuditable implements Serializable {

	/** id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuencia_Area")
	@Setter(value = AccessLevel.NONE)
	private Integer id;

	/** nombre. */
	private String nombre;

	/** ciudades. */
	@ManyToMany
	@Setter(value = AccessLevel.NONE)
	private List<Ciudad> ciudades;

	/** Constant serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -5629494631499741468L;

	/**
	 * Agrega ciudad.
	 *
	 * @param ciudad
	 *            ciudad
	 */
	public void addCiudad(Ciudad ciudad) {
		if (!ciudades.contains(ciudad))
			ciudades.add(ciudad);
	}

}