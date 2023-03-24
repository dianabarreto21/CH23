package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotacion que indica que es una clase cerebro
public class holaMundo {
	@RequestMapping("/") //se va a usar recurso http y que haga lo que está debajo
	public String saludo() {
		return "Hola mundo desde Spring Boot";

	}
}
