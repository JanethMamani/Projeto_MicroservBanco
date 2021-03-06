package com.ibm.IndicadoresBanco.servicos;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.IndicadoresBanco.entidades.Expectativa;

@Service

public class ExpectativaServico {
	
	
	private List<Expectativa> expectativas;
	
	
	public void criarListaExpectativas() {
		if(expectativas == null) {
			expectativas = new ArrayList<>();
			
		}
	}
	
	public static boolean JsonValido(String JsonString) {
		try {
			return new ObjectMapper().readTree(JsonString) != null;
		} catch (IOException e) {
			return false;
		}
	}
	
	public static Integer passarInstituicao(JSONObject expectativa) {
		return Integer.valueOf((int) expectativa.getInt("Instituicao"));
	}
	
	public static String passarIndicador(JSONObject expectativa) {
		return String.valueOf((String) expectativa.getString("Indicador"));
	}
	
	public static String passarDetalhe(JSONObject expectativa) {
		return String.valueOf((String) expectativa.getString("IndicadorDetalhe"));
	}
	
	public static LocalDate passarData(JSONObject expectativa) {
		var dataReferencia = (String) expectativa.get("DataReferencia");
		return ZonedDateTime.parse(dataReferencia).toLocalDate();
	}
	
	public static void setValoresExpectativa(JSONObject expecJson, Expectativa expectativa) {
		expectativa.setInstituicao(expecJson.getInt("Instituicao") != 0 ? passarInstituicao(expecJson) : expectativa.getInstituicao());
		expectativa.setIndicador(expecJson.getString("Indicador") != null ? passarIndicador(expecJson) : expectativa.getIndicador());
		expectativa.setIndicadorDetalhe(expecJson.getString("IndicadorDetalhe") != null ? passarDetalhe(expecJson) : expectativa.getIndicadorDetalhe());
		expectativa.setDataReferencia(expecJson.get("DataReferencia") != null ? passarData(expecJson) : expectativa.getDataReferencia());
	}
	
	public static Expectativa atualizar(Expectativa expectativa, JSONObject expecJson) {
		setValoresExpectativa(expecJson,expectativa);
		return expectativa;
	}
	
	public void add(Expectativa expectativa) {
		criarListaExpectativas();
		expectativas.add(expectativa);
	}
	
	public List<Expectativa> find(){
		criarListaExpectativas();
		
		return expectativas;
	}
	
	public void deletar() {
		expectativas.clear();
	}

	
	

}
