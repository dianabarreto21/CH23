package com.generation.cohorte23.jpa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioServices usuarioService;

	@GetMapping()
	public ArrayList<UsuarioModel> ListarUsuarios() {
		return usuarioService.ListarUsuarios();
	}

	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuarioModelo) {
		return usuarioService.guardarUsuario(usuarioModelo);
	}

	@GetMapping("/query")
	public ArrayList<UsuarioModel> findByPrioridad(@RequestParam("prioridad") Integer prioridad) {
		return usuarioService.obtenerPorPrioridad(prioridad);
	}
	
	@GetMapping (path = "{id}")
	public Optional<UsuarioModel> obtenerUsuarioProId(@PathVariable ("id") Long id){
		return usuarioService.obtenerPorId(id);
	}
	
	@DeleteMapping (path = "/{id}")
	public String eliminarProId(@PathVariable ("id") Long id) {
		boolean ok = usuarioService.eliminarUsuario(id);
		if (ok) {
		return "Se eliminó el usuario";
		}else {
			return "No se eliminó el usuario";
			}
		}
}
