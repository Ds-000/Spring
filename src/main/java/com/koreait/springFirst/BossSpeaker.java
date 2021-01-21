package com.koreait.springFirst;

import org.springframework.stereotype.Component;


public class BossSpeaker implements Speakerable{

	private int currentSpeakerPower;

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

	