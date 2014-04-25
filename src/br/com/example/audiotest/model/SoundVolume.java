package br.com.example.audiotest.model;

public enum SoundVolume{ 
	
	VOLUME_0(0),
	VOLUME_10(10),
	VOLUME_20(20),
	VOLUME_30(30),
	VOLUME_40(40),
	VOLUME_50(50),
	VOLUME_60(60),
	VOLUME_70(80),
	VOLUME_80(80),
	VOLUME_90(80),
	VOLUME_100(80),
	VOLUME_110(110);
	
	private final int volume;

	public int getVolume() {
		return volume;
	}

	private SoundVolume(final int volume){
		this.volume = volume;
	}
}