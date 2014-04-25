//package br.com.example.audiotest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import android.app.Activity;
//import android.content.Context;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Button;
//import br.com.example.audiotest.ModelAudiogram.FREQ;
//import br.com.exemplo.component.CustomComponent;
//
//public class AudiogramActivity extends Activity{
//	
//	private static String TAG = "Log"; 
//	private int id = 1;
//	Context context;
//	CustomComponent audiograma;
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.audiogram);	
//
//		audiograma = (CustomComponent) findViewById(R.id.customComponent1);
//		
//		if(id == 1){
//			valuesAudicaoNormal();
//			Log.i(TAG, "valuesAudicaoNormal()=======>");
//		}else if(id == 2){
//			Log.i(TAG, "valuesAudicaoLeve()=======>");
//			valuesAudicaoLeve();
//		}else if(id == 3){
//			Log.i(TAG, "valuesAudicaoModerada()=======>");
//			valuesAudicaoModerada();
//		}else if(id == 4){
//			Log.i(TAG, "valuesAudicaoModeradamenteSevera()=======>");
//			valuesAudicaoModeradamenteSevera();
//		}else if(id == 5){
//			Log.i(TAG, "valuesAudicaoSevera()=======>");
//			valuesAudicaoSevera();
//		}else if(id == 6){
//			Log.i(TAG, "valuesAudicaoProfunda()=======>");
//			valuesAudicaoProfunda();
//		}
//		
//	}
//	
//	public void valuesAudicaoNormal() {
//		
//		/*
//		 * ≤ 25 dBNAAudição normal Status - Nenhuma dificuldade significativa
//		 */
//		
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 0));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 5));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 5));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 5));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 5));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 5));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 5));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 2));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 0));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 0));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 0));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F8000, 3));
//		
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//
//		
//	}
//
//	public void valuesAudicaoLeve() {
//
//		/*
//		 * 26 - 40 dBNAPerda auditiva de grau leveStatus - Dificuldade, fala
//		 * fraca ou distante
//		 */
//
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 30));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 35));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 40));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 26));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 30));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 30));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//
//		
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 30));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 35));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 40));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 26));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 30));
//		
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//
//	}
//
//	public void valuesAudicaoModerada() {
//
//		/*
//		 * 41 - 55 dBNAPerda auditiva de grau moderadoStatus - Dificuldade com
//		 * fala em nível de conversação
//		 */
//
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 40));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 55));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 45));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 50));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 41));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 41));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 45));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 50));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 55));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 55));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 45));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F8000, 55));
//
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//		
//	}
//
//	public void valuesAudicaoModeradamenteSevera() {
//
//		/*
//		 * 56 - 70 dBNAPerda auditiva de grau moderadamente severoStatus - A
//		 * fala deve ser forte; dificuldade para conversação em grupo
//		 */
//
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 56));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 60));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 65));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 70));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 70));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 70));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 60));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 65));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 70));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 65));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 70));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F8000, 70));
//		
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//
//	}
//
//	public void valuesAudicaoSevera() {
//
//		/*
//		 * 71 - 90 dBNAPerda auditiva de grau severoroStatus - Difi culdade com
//		 * fala intensa; entende somente fala gritada ou amplificada
//		 */
//
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 75));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 80));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 80));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 90));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 90));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 85));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 75));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 85));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 85));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 90));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 85));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F8000, 90));
//		
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//
//	}
//
//	public void valuesAudicaoProfunda() {
//
//		/*
//		 * ≥ 91 dBNAPerda auditiva de grau profundoStatus - Pode não entender
//		 * nem a fala amplificada. Depende da leitura labial
//		 */
//
//		List<ModelAudiogram> dadosOrelhaDireita = new ArrayList<ModelAudiogram>();
//		
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F250, 95));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F500, 95));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F1000, 95));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F2000, 110));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F4000, 95));
//		dadosOrelhaDireita.add(new ModelAudiogram(FREQ.F8000, 120));
//
//		List<ModelAudiogram> dadosOrelhaEsquerda = new ArrayList<ModelAudiogram>();
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F250, 90));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F500, 90));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F1000, 110));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F2000, 95));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F4000, 100));
//		dadosOrelhaEsquerda.add(new ModelAudiogram(FREQ.F8000, 110));
//		
//		audiograma.setData(dadosOrelhaDireita, dadosOrelhaEsquerda);
//		
//	}
//	
//}
