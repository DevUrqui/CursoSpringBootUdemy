package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	/*por defecto es un metodo GET, si entras por https://localhost:8080/index*/
	/*Se puede utilizar GetMapping obviando el method, o PostMapping, DeleteMapping...RequestMapping pero hay que importarlo*/
	/*Retorna el template inicial que se guarda en /resources/templates*/
	@GetMapping({"/index","/","/home"})
	public String index() {
		
		return "index";
	}
}
