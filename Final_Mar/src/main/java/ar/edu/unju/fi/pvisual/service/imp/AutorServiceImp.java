package ar.edu.unju.fi.pvisual.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.pvisual.service.IAutorService;
import ar.edu.unju.fi.pvisual.util.Autor;
import ar.edu.unju.fi.pvisual.util.ListaAutor;

@Service
public class AutorServiceImp implements IAutorService {
	
	@Autowired ListaAutor listaAutores;

	@Override
	public Autor getAutor() {
		
		return new Autor();
	}

	@Override
	public ListaAutor getListaAutor() {
		return listaAutores;
	}

}
