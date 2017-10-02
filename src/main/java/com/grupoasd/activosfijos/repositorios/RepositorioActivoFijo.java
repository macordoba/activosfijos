package com.grupoasd.activosfijos.repositorios;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.grupoasd.activosfijos.entidades.ActivoFijo;
import com.grupoasd.activosfijos.entidades.TipoActivo;

/**
 * La interfaz RepositorioActivoFijo implementa el CRUD de la entidad ActivoFijo
 */
@RepositoryRestResource(path = "activo", collectionResourceRel = "activo")
public interface RepositorioActivoFijo extends PagingAndSortingRepository<ActivoFijo, String> {

	/**
	 * Buscar por serial.
	 *
	 * @param serial
	 *            serial
	 * @return Activos Fijos
	 */
	@RestResource(path = "serial", rel = "serial")
	public List<ActivoFijo> findBySerial(@Param("serial") String serial);

	/**
	 * Buscar por tipo activo.
	 *
	 * @param tipoActivo
	 *            the tipo activo
	 * @return Activos Fijos
	 */
	@RestResource(path = "tipoActivo", rel = "tipoActivo")
	public List<ActivoFijo> findByTipoActivo(@Param("tipoActivo") TipoActivo tipoActivo);

	/**
	 * Buscar por fecha compra.
	 *
	 * @param fechaCompra
	 *            fecha compra
	 * @return Activos Fijos
	 */
	@RestResource(path = "fechaCompra", rel = "fechaCompra")
	public List<ActivoFijo> findByFechaCompra(@Param("fechaCompra") Date fechaCompra);

	/**
	 * Buscar por serial y tipo activo y fecha compra.
	 *
	 * @param serial
	 *            serial
	 * @param tipoActivo
	 *            tipo activo
	 * @param fechaCompra
	 *            fecha compra
	 * @return Activos Fijos
	 */
	@RestResource(path = "varios", rel = "varios")
	public List<ActivoFijo> findBySerialAndTipoActivoAndFechaCompra(@Param("serial") String serial,
			@Param("tipoActivo") TipoActivo tipoActivo, @Param("fechaCompra") Date fechaCompra);

}