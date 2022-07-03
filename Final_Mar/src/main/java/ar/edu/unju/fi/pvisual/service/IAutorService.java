package ar.edu.unju.fi.pvisual.service;

import ar.edu.unju.fi.pvisual.model.Autor;
import ar.edu.unju.fi.pvisual.util.ListaAutor;

public interface IAutorService {
	
	/**
	 * @return Un objeto de tipo Autor.
	 */
	public Autor getAutor();
	/** 
	 * @return Objeto de tipo ListaAutor.
	 */
	public ListaAutor getListaAutor();
}
