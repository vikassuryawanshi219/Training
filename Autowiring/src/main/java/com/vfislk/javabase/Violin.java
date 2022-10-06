package com.vfislk.javabase;

import org.springframework.stereotype.Component;

//@Component
public class Violin implements IInstrument {

	@Override
	public void playMusic(String songName) {
		System.out.println("playing song with violin the song is "+ songName);

	}

}
