package com.ibm.IndicadoresBanco;

import java.io.IOException;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.IndicadoresBanco.entidades.Expectativa;
import com.ibm.IndicadoresBanco.servicos.ExpectativaServico;

@SpringBootApplication
public class IndicadoresBancoApplication implements CommandLineRunner {

	@Autowired
	static
	ExpectativaServico servico;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(IndicadoresBancoApplication.class, args);
		
		//JSONObject expecJson = new JSONObject ("expectativa.json");
		//Expectativa expectativa = null;
		//servico.setValoresExpectativa(expecJson, expectativa);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
