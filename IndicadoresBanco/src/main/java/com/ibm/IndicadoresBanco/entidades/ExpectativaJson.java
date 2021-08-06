package com.ibm.IndicadoresBanco.entidades;

import java.time.LocalDate;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "Indicador", "Data", "DataReferencia", "Media", "Mediana", "DesvioPadrao",
    "CoeficienteVariacao", "Minimo", "Maximo", "NumeroRespondentes", "BaseCalculo" })
@Generated("org.jsonschema2pojo")


public class ExpectativaJson {
	
	@JsonProperty
	private Long id;
	@JsonProperty("Indicador")
	private String indicador;
	@JsonProperty("Data")
	private LocalDate data;
	@JsonProperty("DataReferencia")
	private LocalDate dataReferencia;
	@JsonProperty("Media")
	private Double media;
	@JsonProperty("Mediana")
	private Double mediana;
	@JsonProperty("DesvioPadrao")
	private Double desvioPadrao;
	@JsonProperty("CoeficienteVariacao")
	private Double coeficienteVariacao;
	@JsonProperty("Minimo")
	private Double minimo;
	
	public ExpectativaJson() {
		
	}
	public ExpectativaJson(String indicador, LocalDate data, LocalDate dataReferencia, Double media, Double mediana,
			Double desvioPadrao, Double coeficienteVariacao, Double minimo) {
		super();
		this.indicador = indicador;
		this.data = data;
		this.dataReferencia = dataReferencia;
		this.media = media;
		this.mediana = mediana;
		this.desvioPadrao = desvioPadrao;
		this.coeficienteVariacao = coeficienteVariacao;
		this.minimo = minimo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Double getMediana() {
		return mediana;
	}

	public void setMediana(Double mediana) {
		this.mediana = mediana;
	}

	public Double getDesvioPadrao() {
		return desvioPadrao;
	}

	public void setDesvioPadrao(Double desvioPadrao) {
		this.desvioPadrao = desvioPadrao;
	}

	public Double getCoeficienteVariacao() {
		return coeficienteVariacao;
	}

	public void setCoeficienteVariacao(Double coeficienteVariacao) {
		this.coeficienteVariacao = coeficienteVariacao;
	}

	public Double getMinimo() {
		return minimo;
	}

	public void setMinimo(Double minimo) {
		this.minimo = minimo;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public LocalDate getDataReferencia() {
		return dataReferencia;
	}
	public void setDataReferencia(LocalDate dataReferencia) {
		this.dataReferencia = dataReferencia;
	}
	
	

}
