package ar.edu.unju.fi.pvisual.aplicacion.tp1.model;

public class Libro {
	private String nombre;
	private Autor autor;
	private String genero;
	
	public Libro(String nombre, Autor autor, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
