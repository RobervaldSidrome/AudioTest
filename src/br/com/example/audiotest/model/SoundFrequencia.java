package br.com.example.audiotest.model;

import br.com.example.audiotest.R;

public enum SoundFrequencia{ 
	
	FREQUENCIA_1KHZ(R.raw.um_khz),
	FREQUENCIA_2KHZ(R.raw.dois_khz),
	FREQUENCIA_3KHZ(R.raw.tres_khz),
	FREQUENCIA_4KHZ(R.raw.quatro_khz),
	FREQUENCIA_5KHZ(R.raw.cinco_khz),
	FREQUENCIA_6KHZ(R.raw.seis_khz),
	FREQUENCIA_7KHZ(R.raw.sete_khz),
	FREQUENCIA_8KHZ(R.raw.oito_khz);
	
	
	private final int frequencia;

	public int getFrequencia() {
		return frequencia;
	}


	private SoundFrequencia(final int frequencia){
		this.frequencia = frequencia;
	}
}