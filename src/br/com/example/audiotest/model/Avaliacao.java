package br.com.example.audiotest.model;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Avaliacao {
	
	private String nomeAvaliado;
	
	private LinkedHashMap<SequenciaSonora, Resposta> mapaResultados;
	
	public Avaliacao(String nomeAvaliado) {
		mapaResultados = new LinkedHashMap<SequenciaSonora, Resposta>();
	}

	public String getNomeAvaliado() {
		return nomeAvaliado;
	}

	public void setNomeAvaliado(String nomeAvaliado) {
		this.nomeAvaliado = nomeAvaliado;
	}

	public LinkedHashMap<SequenciaSonora, Resposta> getMapaResultados() {
		return mapaResultados;
	}
	
	public Resposta adicionarResultado(SequenciaSonora seq, Resposta value) {
		return mapaResultados.put(seq, value);
	}
	
	public LinkedHashMap<SequenciaSonora, Resposta> getMapaResultadosOrelhaDireita() {
		LinkedHashMap<SequenciaSonora, Resposta> mapaOrelhaDireita = new LinkedHashMap<SequenciaSonora, Resposta>();
		
		for (Entry<SequenciaSonora, Resposta> registro : mapaResultados.entrySet()) {
			if (((SequenciaSonora)registro.getKey()).getOrelha().equals(Orelha.ORELHA_DIREITA)) {
				mapaOrelhaDireita.put(registro.getKey(), registro.getValue());
			}
		}
		
		return mapaOrelhaDireita;
		
	}
	
	public LinkedHashMap<SequenciaSonora, Resposta> getMapaResultadosOrelhaEsquerda() {
		
		LinkedHashMap<SequenciaSonora, Resposta> mapaOrelhaEsquerda = new LinkedHashMap<SequenciaSonora, Resposta>();
		
		for (Entry<SequenciaSonora, Resposta> registro : mapaResultados.entrySet()) {
			if (((SequenciaSonora)registro.getKey()).getOrelha().equals(Orelha.ORELHA_ESQUERDA)) {
				mapaOrelhaEsquerda.put(registro.getKey(), registro.getValue());
			}
		}
		
		return mapaOrelhaEsquerda;
	}

}
