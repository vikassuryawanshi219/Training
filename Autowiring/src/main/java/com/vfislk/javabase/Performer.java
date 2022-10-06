package com.vfislk.javabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Performer {
	
	@Autowired
	IInstrument instrument;
	
	@Autowired
	@Qualifier("getKeyboard")
	IInstrument keyboard;
	
	@Autowired
	@Qualifier("getViolin")
	IInstrument violin;
	
	public void performSong(String choice,String songName) {
		System.out.println("playing song");
		
		if(choice.equals("guitor"))
		instrument.playMusic(songName);
		
		if(choice.equals("keyboard"))
			keyboard.playMusic(songName);
		
		if(choice.equals("violin"))
			violin.playMusic(songName);
	}
	
 }
