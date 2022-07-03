package ar.edu.unju.fi.pvisual.util;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.pvisual.model.Autor;
/**
 * Clase que contiene una lista con los autores del grupo 23 que participaron en el proyecto
 * @author Marianella Machicado
 */
@Component
public class ListaAutor {
	private ArrayList<Autor> autores;
	
	/**
	 * Contructor con un ArrayList cargado 
	 */
	public ListaAutor() {
		//crea la lista de Autores
		autores = new ArrayList<Autor>();
		
		String descripcion="Estudiante de la carrera Analista Programador Universitario";
		//carga de autores al ArrayList
		autores.add(new Autor(1,"autor.png", "Paco Kevin", descripcion, "Integrante del grupo 23"));
		autores.add(new Autor(1,"autor.png", "Machicado Marianella Rocio Denis", descripcion, "Integrante del grupo 23"));
		autores.add(new Autor(1,"autor.png", "Sumbaino Joel Agustin", descripcion, "Integrante del grupo 23"));
	}
	
	/**
	 * @return Un ArrayList que contiene objetos de tipo Autor
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	
	/**
	 * @param autores
	 */
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
	
}
