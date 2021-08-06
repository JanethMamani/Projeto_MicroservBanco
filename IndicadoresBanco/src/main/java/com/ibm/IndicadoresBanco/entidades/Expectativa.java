package com.ibm.IndicadoresBanco.entidades;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expec")

public class Expectativa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
