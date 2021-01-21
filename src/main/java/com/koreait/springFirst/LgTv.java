package com.koreait.springFirst;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTv extends Tv{

	

	public LgTv() {

		super(100,20);
		System.out.println("---LgTv created 기본생성");
	}

 

	public LgTv(int maxChannel, int maxVolume) {

		super(maxChannel, maxVolume);
		System.out.println("---LgTv created overrided 생성자");
	}

	

	@Override

	public String toString() {

		return "LgTv : " + super.toString();

	}

	

}