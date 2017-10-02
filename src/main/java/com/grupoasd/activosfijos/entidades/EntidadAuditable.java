package com.grupoasd.activosfijos.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.Setter;

/**
 * La clase EntidadAuditable es la clase base que extienden todas las entidades
 * para tener auditoria
 */
@MappedSuperclass
@Getter
@Setter
public abstract class EntidadAuditable {

	/** usuario creacion. */
	@OneToOne
	@JoinColumn(name = "id_Persona_crea", updatable = false)
	private Persona usuarioCreacion;

	/** fecha creacion. */
	@Column(nullable = false, updatable = false)
	private Date fechaCreacion;

	/** usuario modificacion. */
	@OneToOne
	@JoinColumn(name = "id_Persona_mod")
	private Persona usuarioModificacion;

	/** fecha modificacion. */
	@Column
	private Date fechaModificacion;

	/**
	 * Sets the datos.
	 */
	@PrePersist
	private void setDatos() {
		fechaCreacion = new Date();
	}

	/**
	 * Sets the datos actualizacion.
	 */
	@PreUpdate
	private void setDatosActualizacion() {
		fechaModificacion = new Date();
	}

}