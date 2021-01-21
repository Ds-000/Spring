package com.koreait.springFirst;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Tv { // abstract:추상클래스 => 객체화 막을수 있음  ex) 동물(객체화 되면 안됨)
	@Autowired  //자동으로 읻자 빈등록 한애중에 스피커블이란 타입이 가르킬수있는애를 자동으로 등록해주자
	private Speakerable speaker;

	private int maxChannel;

	private int currentChannel;

	private int maxVolume;

	private int currentVolume;

	

	public Tv(int maxChannel, int maxVolume) {

		super();//부모의 기본생성자 호출

		this.maxChannel = maxChannel;

		this.maxVolume = maxVolume;

	}

	

	public void VolumeUp() {

		if(maxVolume > currentVolume) {			

		currentVolume++;

		}

		speaker.speakUp();

	}

	

	public void VolumeDown() {

		if(currentVolume > 0) {

			currentVolume--;

		}

		speaker.speakDown();

	}

	

	public void setSpeaker(Speakerable speaker) {

		this.speaker = speaker;

	}

	

	@Override

	public String toString() { //오브젝트의 toString 말고 오버라이딩하여 원하는걸 쓰겠다

		return String.format("currentChannel : %d, currentVolume : %d"

				, currentChannel, currentVolume);

	}

	

}

	

/* Has A  포함 ex) 스피커-티비

 * is A   상속 ex)

 * 

 * 

*/