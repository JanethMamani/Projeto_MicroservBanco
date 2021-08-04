package com.ibm.IndicadoresBanco.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ibm.IndicadoresBanco.entidades.Expectativa;

@Component
public class ExpectativaRepositorio {
	
	private static Map<Integer, Expectativa> mapear = new HashMap<>();
	
	public void salvar(Expectativa objeto) {
		mapear.put(objeto.getInstituicao(), objeto);
	}
	
	public Expectativa ProcurarPelaInstituicao(Integer instituicao) {
		return mapear.get(instituicao);
	}
	
	public static List<Expectativa> findAll(){
		return new ArrayList<Expectativa>(mapear.values());
	}

}
