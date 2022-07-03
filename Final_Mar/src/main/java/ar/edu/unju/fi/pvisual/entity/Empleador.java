package ar.edu.unju.fi.pvisual.entity;

import java.time.LocalDate;

/**
 * Contiene información del usuario que ofrece una oferta laboral(una persona empleador o una empresa)
 * @author Mar
 *
 */
public class Empleador {
	private int cuit;
	private String contrasena;
	private String razonSocial;
	private String nombreComercial;
	private LocalDate fechaInicio;
	private String email;
	private String telefono;
	private String domicilio;
	
	public Empleador(int cuit, String contrasena, String razonSocial, String nombreComercial, LocalDate fechaInicio,
			String email, String telefono, String domicilio) {
		this.cuit = cuit;
		this.contrasena = contrasena;
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.fechaInicio = fechaInicio;
		this.email = email;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
}
