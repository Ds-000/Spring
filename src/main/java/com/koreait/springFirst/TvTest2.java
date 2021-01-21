package com.koreait.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");
		
		Tv tv = (Tv)ctx.getBean("tv");
		tv.VolumeUp();
		System.out.println(tv);
		
		
		
	}

}
