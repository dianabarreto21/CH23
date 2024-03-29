package com.generation.cohorte23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.app.model.Libro;
import com.generation.cohorte23.app.repositories.LibrosRepositorios;

@RestController
public class LibroController {
	@Autowired //Esta anotacion hace tu instancia sin necesidad de hacer el new etc..
	LibrosRepositorios libroRepo;
	@RequestMapping ("/libros") //usa el http 
	public List<Libro> listarTodo(){
		return libroRepo.listarLibros();
	}
}
