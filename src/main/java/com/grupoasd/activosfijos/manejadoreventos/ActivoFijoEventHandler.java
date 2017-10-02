package com.grupoasd.activosfijos.manejadoreventos;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.grupoasd.activosfijos.entidades.ActivoFijo;
import com.grupoasd.activosfijos.excepciones.ActivoFijoException;

/**
 * The Class ActivoFijoEventHandler.
 */
@RepositoryEventHandler
public class ActivoFijoEventHandler {

	/**
	 * Valida antes de guardar Activo Fijo.
	 *
	 * @param activoFijo
	 *            activo fijo
	 * @throws ActivoFijoException
	 *             lanza la excepcion ActivoFijoException
	 */
	@HandleBeforeCreate
	public void handleActivoFijoSave(ActivoFijo activoFijo) throws ActivoFijoException {

		if (activoFijo.getFechaBaja() != null && activoFijo.getFechaBaja().before(activoFijo.getFechaCompra()))
			throw new ActivoFijoException("La fecha de baja debe ser superior a una fecha de compra");
	}

	/**
	 * Valida antes de actualizar Activo Fijo.
	 *
	 * @param activoFijo
	 *            activo fijo
	 * @throws ActivoFijoException
	 *             lanza la excepcion ActivoFijoException
	 */
	@HandleBeforeSave
	public void handleActivoFijoUpdate(ActivoFijo activoFijo) throws ActivoFijoException {
		if (activoFijo.getFechaBaja() != null && activoFijo.getFechaBaja().before(activoFijo.getFechaCompra()))
			throw new ActivoFijoException("La fecha de baja debe ser superior a una fecha de compra");
	}

}