package com.ibm.IndicadoresBanco;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.IndicadoresBanco.repositorio.ExpectativaRepositorio;
import com.ibm.IndicadoresBanco.servicos.ExpectativaServico;

@SpringBootApplication
public class IndicadoresBancoApplication implements CommandLineRunner {

	@Autowired
	static
	ExpectativaServico servico;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(IndicadoresBancoApplication.class, args);
		
		JSONObject expecJson = new JSONObject ("expectativa.json");
		
		
		/*
		String expecJson = String.join(" ", Files.readAllLines(Paths.get("/Users/008978631/Documents/Mcroserviços-IndicadoresDeBanco/IndicadoresBanco/src/main/resources/expectativa.json"),StandardCharsets.UTF_8));
		
		JSONParser passar = new JSONParser(expecJson);
		
		servico = (ExpectativaServico) passar();
		*/
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
