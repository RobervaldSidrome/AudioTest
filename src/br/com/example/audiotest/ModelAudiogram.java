package br.com.example.audiotest;


public class ModelAudiogram {

	public FREQ frenquencia;
	public int decibel;
	
	public ModelAudiogram(FREQ frequencia, int decibel) {
		this.frenquencia = frequencia;
		this.decibel = decibel;
	
	}

	public ModelAudiogram() {}

	public enum FREQ {
		
		F250(1),
		F500(2),
		F1000(3),
		F2000(4),
		F4000(5),
		F8000(6);
		
		public int coluna;
		
		private FREQ(final int coluna) {
			
			this.coluna = coluna;
		}
		
	}
	
}