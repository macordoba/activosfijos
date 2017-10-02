package com.grupoasd.activosfijos.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entidad JPA persona.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Persona extends EntidadAuditable implements Serializable, UserDetails {

	/**  encoder. */
	@Transient
	private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

	/**  numero documento. */
	@Id
	private Integer numeroDocumento;

	/**  primer nombre. */
	private String primerNombre;

	/**  segundo nombre. */
	private String segundoNombre;

	/**  primer apellido. */
	private String primerApellido;

	/**  segundo apellido. */
	private String segundoApellido;

	/**  correo. */
	private String correo;

	/**  perfiles. */
	@ManyToMany
	private List<Perfil> perfiles;

	/**  password. */
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	/** Constante serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -939922149612941358L;

	@Override
	@JsonIgnore
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<SimpleGrantedAuthority> permisos = new ArrayList<>();

		for (Perfil perfilTemporal : perfiles) {
			permisos.add(new SimpleGrantedAuthority(perfilTemporal.getNombre()));
		}

		return permisos;
	}

	@Override
	@JsonIgnore
	public String getUsername() {
		return correo;
	}

	@Override
	@JsonIgnore
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isEnabled() {
		return true;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            password
	 */
	public void setPassword(String password) {
		this.password = encoder.encode(password);
	}

}