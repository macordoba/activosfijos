package com.grupoasd.activosfijos.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.grupoasd.activosfijos.entidades.Persona;
import com.grupoasd.activosfijos.repositorios.RepositorioPersona;

/**
 * La clase ConfiguracionSeguridad configura el modulo de Spring Security
 */
@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter {

	/** variable inyecta el repositorio persona. */
	@Autowired
	RepositorioPersona repositorioPersona;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) {

				if (username.trim().isEmpty()) {
					throw new UsernameNotFoundException("El campo correo se encuentra vacio");
				}

				Persona user = repositorioPersona.findByCorreo(username);

				if (user == null) {
					throw new UsernameNotFoundException("Usuario: " + username + " no encontrado");
				}

				return user;
			}

		});
	}

}