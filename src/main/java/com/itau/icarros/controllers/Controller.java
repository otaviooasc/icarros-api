package com.itau.icarros.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.icarros.services.Formula1Service;

@RestController
@RequestMapping("/api/formula1")
public class Controller {
	
	@Autowired
	private Formula1Service service;
	
	@GetMapping("/buscartodos")
	public ResponseEntity<Object> buscarTodos() throws IOException {
		return ResponseEntity.ok(service.buscarTodos());
	}
}
