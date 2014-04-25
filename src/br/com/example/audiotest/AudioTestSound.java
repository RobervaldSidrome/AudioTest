package br.com.example.audiotest;

import android.net.Uri;

public class AudioTestSound {

	private transient Uri uri;
	private transient int position;
	
	
	public AudioTestSound(final Uri uri) {
		this.uri = uri;
	}
	
	public Uri getUri() {
		return uri;
	}
	public void setUri(final Uri uri) {
		this.uri = uri;
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(final int position) {
		this.position = position;
	}
	
	
}
