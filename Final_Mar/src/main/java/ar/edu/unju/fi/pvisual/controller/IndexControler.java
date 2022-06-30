package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleos")
public class IndexControler {
	
	@GetMapping("/inicio")
	public String getIndexPagina() {
		return "index";
	}
}
