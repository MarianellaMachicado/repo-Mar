package ar.edu.unju.fi.pvisual.model;
/**
 * Contiene información de un autor del proyecto
 * @author Marianella Machicado
 *
 */
public class Autor {
	private int id;
	private String urlImagen;
	private String apellidoYnombre;
	private String descripcion;
	private String grupo;
	
	/**
	 * Constructo por defecto sin parametros
	 */
	public Autor() {
		
	}
	
	/**
	 * Constructor con todos los parametros de la clase Autor
	 * @param id
	 * @param urlImagen
	 * @param apellidoYnombre
	 * @param descripcion
	 * @param grupo
	 */
	public Autor(int id, String urlImagen, String apellidoYnombre, String descripcion, String grupo) {
		this.id = id;
		this.urlImagen = urlImagen;
		this.apellidoYnombre = apellidoYnombre;
		this.descripcion = descripcion;
		this.grupo = grupo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getApellidoYnombre() {
		return apellidoYnombre;
	}

	public void setApellidoYnombre(String apellidoYnombre) {
		this.apellidoYnombre = apellidoYnombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	
}
