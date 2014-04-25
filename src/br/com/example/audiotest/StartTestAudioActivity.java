package br.com.example.audiotest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartTestAudioActivity extends Activity implements OnClickListener{

	Button start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_audio);
		
		start = (Button)findViewById(R.id.button_start_main);
		start.setOnClickListener(this);
	}
	

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, TestAudioActivity.class);
		startActivity(intent);
	}
	
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

}
