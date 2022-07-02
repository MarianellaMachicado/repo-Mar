package ar.edu.unju.fi.pvisual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.service.IAutorService;

@Controller
@RequestMapping("/empleos")
public class AutorController {
	
	@Autowired IAutorService autorService;
	
	/**
	 * Muestra en una pagina a los autores que participaron en el proyecto final
	 * @param model contiene la lista de autores
	 * @return la pagina autores.html
	 */
	@GetMapping("/autores")
	public String verPaginaAutores(Model model){
		model.addAttribute("autores", autorService.getListaAutor().getAutores());
		return "autores";
	}
}
