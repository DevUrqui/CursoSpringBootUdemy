package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	/*por defecto es un metodo GET, si entras por https://localhost:8080/index*/
	/*Se puede utilizar GetMapping obviando el method, o PostMapping, DeleteMapping...RequestMapping pero hay que importarlo*/
	/*Retorna el template inicial que se guarda en /resources/templates*/
	/*@GetMapping({"/index","/","/home"})
	public String index(Model model) { 
		model.addAttribute("titulo","Hola Spring Framework con Map!");
		return "index";
	@GetMapping({"/index","/","/home"})
	public String index(ModelMap model) {
		model.addAttribute("titulo","Hola Spring Framework con ModelMap!");
		return "index";
	}
	@GetMapping({"/index","/","/home"})
	public String index(Map<String, Object> map) { 
		map.put("titulo","Hola Spring Framework con Map!");
		return "index";
	}*/
	@GetMapping({"/index","/","/home"})
	public ModelAndView index(ModelAndView mv) { 
		mv.addObject("titulo","Hola Spring Framework con ModelAndView!");
		mv.setViewName("index"); //Selecciona el nombre de la vista
		return mv;
	}
}
