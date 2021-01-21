package com.koreait.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		Speakerable bs = (Speakerable) ctx.getBean("refSpeaker");
		System.out.println(bs);
		
		Speakerable bs2 = (Speakerable) ctx.getBean("refSpeaker");
		System.out.println(bs2);
		
		Tv tv = (Tv)ctx.getBean("Tv");
		System.out.println("tv");
		
		
		
		tv.VolumeDown();
	}

}
