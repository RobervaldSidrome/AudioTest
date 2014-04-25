package br.com.example.audiotest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.com.example.audiotest.model.Orelha;
import br.com.example.audiotest.model.SoundFrequencia;

public class TestAudioActivity extends Activity implements OnClickListener{
	
	protected static final String TAG = "log";
	private Button finishTest;
	private Button orelhaDireita;
	private Button orelhaEsquerda;
	private Button clickPlayer;
	private boolean clicked = true;
	private MediaPlayer mediaPlayer;
	private SoundFrequencia soundFreq;
	private List<Orelha> listOrelhaSound = new ArrayList<Orelha>();
	Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_audio_main);
		
		finishTest = (Button) findViewById(R.id.button_finalise_test);
		finishTest.setOnClickListener(this);	
		
		clickPlayer = (Button) this.findViewById(R.id.button_start_play);
		clickPlayer.setOnClickListener(this);
		
		orelhaDireita = (Button)this.findViewById(R.id.button_orelha_direita);
		orelhaDireita.setOnClickListener(this);
		
		orelhaEsquerda = (Button)this.findViewById(R.id.button_orelha_esquerda);
		orelhaEsquerda.setOnClickListener(this);
		
		soundFreq = SoundFrequencia.FREQUENCIA_2KHZ;
		Log.i(TAG,"soundFreq========>"+soundFreq);
	    mediaPlayer = MediaPlayer.create(this, soundFreq.getFrequencia());
	    
		
	}
	
	@Override
	public void onClick(View view) {

		switch (view.getId()) {

		case R.id.button_start_play:
			Log.i(TAG, "clicou no botão play=====>");
			try {
				mediaPlayer.prepare();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mediaPlayer.start();
			break;

		case R.id.button_orelha_direita:
			
			break;

		case R.id.button_orelha_esquerda:
		
			break;

		case R.id.button_finalise_test:	
			break;

		default:
			break;
		}
	}

	public void validaTest(){
		
		if(finishTest != null){
			finishTest.getContext();
		}else{
			Toast.makeText(this, R.string.text_toast_alert_finish, Toast.LENGTH_LONG).show();
		}
	}

//	public void onClick(final Bundle data) {
//		Intent intent = new Intent(this, AudiogramActivity.class);
//		startActivity(intent);
//	}
	
	public void callAudiogram() {
//		final Intent intent = new Intent();
//		intent.setClass(this, AudiogramActivity.class);
//		startActivity(intent);
	}
	
	
//	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onResume() {
		super.onResume();
//		try{
//			mediaPlayer.start();
//
//		}catch(Exception we){
//			we.printStackTrace();
//		}

	}

	@Override
	protected void onPause() {
		super.onPause();
		try{
			if (mediaPlayer.isPlaying()) {
				mediaPlayer.pause();
			}
		}catch(Exception we){
			we.printStackTrace();
		}

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if(mediaPlayer != null){
			mediaPlayer.release();
			mediaPlayer = null;
		}
	}

	@Override
	public void onBackPressed() {
		if(clickPlayer != null){
		  super.onBackPressed();
		}
	}

//	@Override
//	public void onPrepared(MediaPlayer mediaplayer) {
//		// TODO Auto-generated method stub
//		if(mediaplayer != null){
//			mediaplayer.start();
//		}
//	}

}
