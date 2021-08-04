package com.ibm.IndicadoresBanco.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.IndicadoresBanco.entidades.Expectativa;
import com.ibm.IndicadoresBanco.repositorio.ExpectativaRepositorio;

@RestController
@RequestMapping(value = "/expectativa")
public class ExpectativaRecursos {
	
	@Autowired
	private ExpectativaRepositorio BancoRepo;
	
	@GetMapping
	public ResponseEntity<List<Expectativa>> findAll() {
		List<Expectativa> expectativas = ExpectativaRepositorio.findAll();
		return ResponseEntity.ok().body(expectativas);
	}
	

}
