package ar.edu.unju.fi.pvisual.entity;

/**
 * Contiene información acerca de una oferta laboral
 * @author Marianella Machicado
 *
 */
public class OfertaLaboral {
	private int id;
	private int cantidadVacantes;
	private String puesto;
	private String descripcion;
	private int disponibilidadHoraria;
	private String tareasPrincipales;
	private String datosContacto;
	private String jornada;
	private String requisitos;
	private double salario;
	private String beneficios;
	private boolean disponible;
	
	public OfertaLaboral() {}
	
	public OfertaLaboral(int id, int cantidadVacantes, String puesto, String descripcion, int disponibilidadHoraria,
			String tareasPrincipales, String datosContacto, String jornada, String requisitos, double salario,
			String beneficios, boolean disponible) {
		this.id = id;
		this.cantidadVacantes = cantidadVacantes;
		this.puesto = puesto;
		this.descripcion = descripcion;
		this.disponibilidadHoraria = disponibilidadHoraria;
		this.tareasPrincipales = tareasPrincipales;
		this.datosContacto = datosContacto;
		this.jornada = jornada;
		this.requisitos = requisitos;
		this.salario = salario;
		this.beneficios = beneficios;
		this.disponible = disponible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadVacantes() {
		return cantidadVacantes;
	}

	public void setCantidadVacantes(int cantidadVacantes) {
		this.cantidadVacantes = cantidadVacantes;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(int disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

	public String getTareasPrincipales() {
		return tareasPrincipales;
	}

	public void setTareasPrincipales(String tareasPrincipales) {
		this.tareasPrincipales = tareasPrincipales;
	}

	public String getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(String datosContacto) {
		this.datosContacto = datosContacto;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
