package com.grupoasd.activosfijos.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidad JPA de Activo Fijo.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class ActivoFijo extends EntidadAuditable implements Serializable {

	/**  serial. */
	@Id
	private String serial;
	
	/**  nombre. */
	private String nombre;
	
	/**  descripcion. */
	private String descripcion;
	
	/**  numero interno. */
	private Integer numeroInterno;
	
	/**  peso. */
	private Integer peso;
	
	/**  alto. */
	private Integer alto;
	
	/**  ancho. */
	private Integer ancho;
	
	/**  tipo activo. */
	@OneToOne
	private TipoActivo tipoActivo;
	
	/**  estado. */
	@OneToOne
	private Estado estado;
	
	/**  color. */
	@OneToOne
	private Color color;
	
	/**  persona. */
	@OneToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	/**  area. */
	@OneToOne
	private Area area;
	
	/**  largo. */
	private Integer largo;
	
	/**  valor compra. */
	private Integer valorCompra;
	
	/**  fecha compra. */
	@Column(columnDefinition = "DATE")
	private Date fechaCompra;
	
	/**  fecha baja. */
	@Column(columnDefinition = "DATE")
	private Date fechaBaja;

	/**  Cosntante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = 1384015045720134980L;

}