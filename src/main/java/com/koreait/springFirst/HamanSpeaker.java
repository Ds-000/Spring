package com.koreait.springFirst;

import org.springframework.stereotype.Component;


public class HamanSpeaker implements Speakerable{
	
	private int currentSpeakerPower;

	public HamanSpeaker() {
		System.out.println("---HamanSpeaker---");
	}
	@Override
	public void speakUp() {
		currentSpeakerPower++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speakDown() {
		currentSpeakerPower--;
		// TODO Auto-generated method stub
		
	}

}
