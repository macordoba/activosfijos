package com.grupoasd.activosfijos.repositorios;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * la clase RepositorioInternacionalizacion implementa el servicio REST de
 * Internacionalizacion
 */
@RestController
public class RepositorioInternacionalizacion {

	/**
	 * 
	 * @param idioma
	 *            idioma
	 * @return texto
	 */
	@GetMapping("/api/internacionalizacion/{idioma}")
	public String getSaludo(@PathVariable(value = "idioma", required = true) String idioma) {

		ResourceBundle bundle = null;

		if (idioma.equals("en"))
			bundle = ResourceBundle.getBundle("bundles.activosfijos", new Locale("en", "US"));
		else if (idioma.equals("es"))
			bundle = ResourceBundle.getBundle("bundles.activosfijos", new Locale("es", "CO"));
		else
			return "por favor ingrese es o en";

		return bundle.getString("prueba.saludo");
	}

}