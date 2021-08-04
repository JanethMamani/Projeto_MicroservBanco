package com.ibm.IndicadoresBanco.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


public class Expectativa implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer instituicao;
	private String indicador;
	private String indicadorDetalhe;
	private LocalDate dataReferencia;
	
	public Expectativa() {
		
	}

	public Expectativa(Integer instituicao, String indicador, String indicadorDetalhe, LocalDate dataReferencia) {
		super();
		this.instituicao = instituicao;
		this.indicador = indicador;
		this.indicadorDetalhe = indicadorDetalhe;
		this.dataReferencia = dataReferencia;
	}

	public Integer getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Integer instituicao) {
		this.instituicao = instituicao;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public String getIndicadorDetalhe() {
		return indicadorDetalhe;
	}

	public void setIndicadorDetalhe(String indicadorDetalhe) {
		this.indicadorDetalhe = indicadorDetalhe;
	}

	public LocalDate getDataReferencia() {
		return dataReferencia;
	}

	public void setDataReferencia(LocalDate dataReferencia) {
		this.dataReferencia = dataReferencia;
	}
	
	

}
