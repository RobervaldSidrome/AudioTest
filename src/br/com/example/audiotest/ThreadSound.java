package br.com.example.audiotest;

import br.com.example.audiotest.model.SoundFrequencia;
import android.os.Handler;


public class ThreadSound extends Thread {

	private final int DELAY = 5000;
	private SoundFrequencia soundFreqId;
	private final boolean load = false;
	
	Handler handler = new Handler();

	public ThreadSound(final SoundFrequencia soundFreqId){
		this.soundFreqId = soundFreqId;
	}

	Thread thread = new Thread() {

		@Override
		public void run() {
			while(!load){

				try{
					thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				handler.postDelayed(new Runnable() {

					@Override
					public void run() {
//						handler.postDelayed(this, DELAY);
						soundFreqId.getFrequencia();
					}
				}, DELAY);
			}
		}
	};
}



