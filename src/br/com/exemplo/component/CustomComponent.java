package br.com.exemplo.component;

import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import br.com.example.audiotest.DisplayUtil;
import br.com.example.audiotest.ModelAudiogram;
import br.com.example.audiotest.TestAudioActivity;
import br.com.example.audiotest.model.Avaliacao;
import br.com.example.audiotest.model.Resposta;
import br.com.example.audiotest.model.SequenciaSonora;
import br.com.example.audiotest.model.TesteAvaliacao;

public class CustomComponent extends View {

	private static final String TAG = "log";
	private int NUM_COLS = 7;
	private int NUM_ROWS = 13;
	
	List<TestAudioActivity> dadosOrelhaDireita;
	List<TestAudioActivity> dadosOrelhaEsquerda;
	
	private Avaliacao avaliacao;
	
	public CustomComponent(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		DisplayUtil.init(context);
		
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
	}
	
	public void setData(List<TestAudioActivity> dadosOrelhaDireita, List<TestAudioActivity> dadosOrelhaEsquerda){
		this.dadosOrelhaDireita = dadosOrelhaDireita;
		this.dadosOrelhaEsquerda = dadosOrelhaEsquerda;
		
		invalidate();
	}

	protected void onDraw(Canvas c) {
		super.onDraw(c);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);

		// Cor do Fundo da Tela
		paint.setColor(Color.WHITE);
		c.drawPaint(paint);

		paint.setColor(Color.rgb(220, 220, 220));

		int tamCols = c.getWidth() / NUM_COLS;// divide por NUM_COLS colunas
		int tamRows = c.getHeight() / NUM_ROWS;// divide por NUM_ROWS linhas

		for (int i = 0; i < NUM_ROWS; i++) {
			c.drawLine(0, tamRows * (i + 1), c.getWidth(), tamRows * (i + 1),paint);
		}

		for (int i = 0; i < NUM_COLS; i++) {
			c.drawLine(tamCols * (i + 1), 0, tamCols * (i + 1), c.getHeight(),paint);
		}

		Integer decAnt = null;
		
		paint.setAntiAlias(true);
		paint.setColor(Color.RED);

		for (int i = 0; dadosOrelhaDireita != null && i < dadosOrelhaDireita.size(); i++) {

			int freq = dadosOrelhaDireita.get(i).
			int dec = dadosOrelhaDireita.get(i).decibel + 10;

			c.drawCircle(tamCols * freq, (tamRows * dec / 10), 15, paint);

			if (decAnt != null) {
				c.drawLine(tamCols * (freq - 1), (tamRows * decAnt / 10),tamCols * freq, (tamRows * dec / 10), paint);
			}

			decAnt = dec;

		}
				
		paint.setAntiAlias(true);
		paint.setColor(Color.BLUE);
		
		for (int i = 0; dadosOrelhaEsquerda != null && i < dadosOrelhaEsquerda.size(); i++) {

			int freq = dadosOrelhaEsquerda.get(i).frenquencia.coluna;
			int dec = dadosOrelhaEsquerda.get(i).decibel + 10;

			c.drawCircle(tamCols * freq, (tamRows * dec / 10), 15, paint);

			if (decAnt != null) {
				c.drawLine(tamCols * (freq - 1), (tamRows * decAnt / 10),tamCols * freq, (tamRows * dec / 10), paint);
			}

			decAnt = dec;
			

		}
	}	
	
}
