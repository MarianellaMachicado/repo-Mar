package ar.edu.unju.fi.pvisual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControler {
	
	@GetMapping("/inicio")
	public String getIndexPagina() {
		return "index";
	}
}
