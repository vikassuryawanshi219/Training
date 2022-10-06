package com.vfislk.javabase;

import org.springframework.stereotype.Component;

//@Component
public class Guitor implements IInstrument {

	@Override
	public void playMusic(String songName) {
	System.out.println("playing song with guitor the song is "+ songName);

	}

}
