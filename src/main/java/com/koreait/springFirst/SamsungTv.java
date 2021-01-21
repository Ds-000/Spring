package com.koreait.springFirst;

public class SamsungTv extends Tv{

	

	public SamsungTv() {

		super(100,20);
		System.out.println("---SamsungTv created 기본생성");
	}

 

	public SamsungTv(int maxChannel, int maxVolume) {

		super(maxChannel, maxVolume);
		System.out.println("---SamsungTv created overrided 생성자");
	}

	

	@Override

	public String toString() {

		return "SamsungTv : " + super.toString();

	}

	

}


