package ar.edu.unju.fi.pvisual.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.pvisual.util.Autor;

@Controller
@RequestMapping("/empleos")
public class AutorController {
	
	public List<Autor> getAutores(){
		List<Autor> listaAutores = new ArrayList<>();
		listaAutores.add(new Autor(1,"autor.png", "Paco Kevin", "Estudiante de la carrera Analista Programador Universitario", "Integrante del grupo 23"));
		listaAutores.add(new Autor(2,"autor.png", "Machicado Marianella Rocio Denis", "Estudiante de la carrera Analista Programador Universitario", "Integrante del grupo 23"));
		listaAutores.add(new Autor(3,"autor.png", "Sumbaino Joel Agustin", "Estudiante de la carrera Analista Programador Universitario", "Integrante del grupo 23"));
		return listaAutores;
	}
	
	@GetMapping("/autores")
	public String verPaginaAutores(Model model){
		model.addAttribute("autores", getAutores());
		return "autores";
	}
}
