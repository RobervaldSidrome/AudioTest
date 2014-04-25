package br.com.example.audiotest.model;

import br.com.example.audiotest.R;
import br.com.exemplo.component.CustomComponent;
import android.app.Activity;
import android.os.Bundle;


public class TesteAvaliacao extends Activity {
	
	private Avaliacao ava;
	CustomComponent audiograma;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.audiogram);	
		
		audiograma = (CustomComponent) findViewById(R.id.customComponent1);
		
	}	
	
	public TesteAvaliacao() {
		ava = new Avaliacao("");
		
		ava.adicionarResultado(SequenciaSonora.TESTE_1_125_D,  Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_125_E,  Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_250_D,  Resposta.ORELHA_ERRADA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_250_E,  Resposta.AUSENCIA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_500_D,  Resposta.AUSENCIA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_500_E,  Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_1000_D, Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_1000_E, Resposta.ORELHA_ERRADA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_2000_D, Resposta.ORELHA_ERRADA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_2000_E, Resposta.AUSENCIA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_4000_D, Resposta.AUSENCIA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_4000_E, Resposta.ORELHA_ERRADA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_6000_D, Resposta.ORELHA_ERRADA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_6000_E, Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_8000_D, Resposta.ORELHA_CERTA);
		ava.adicionarResultado(SequenciaSonora.TESTE_1_8000_E, Resposta.ORELHA_CERTA);
		
		getAvaliacao().getMapaResultadosOrelhaDireita();
		getAvaliacao().getMapaResultadosOrelhaEsquerda();
	}
	
	public Avaliacao getAvaliacao() {
		return ava;
	}

}
