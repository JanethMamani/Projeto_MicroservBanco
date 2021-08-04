package com.ibm.IndicadoresBanco.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.IndicadoresBanco.entidades.Expectativa;
import com.ibm.IndicadoresBanco.servicos.ExpectativaServico;

@RestController
@RequestMapping(value = "/api/expectativas")
public class ExpectativaRecursos {
	
	@Autowired
	private ExpectativaServico servicos;
	
	@GetMapping
	public ResponseEntity<List<Expectativa>> find() {
		if(servicos.find().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(servicos.find());
	}
	
	@DeleteMapping
	public ResponseEntity<Boolean> deletar(){
		try{
			servicos.deletar();
			return ResponseEntity.noContent().build();
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	

}
