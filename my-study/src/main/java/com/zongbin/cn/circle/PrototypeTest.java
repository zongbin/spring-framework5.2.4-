package com.zongbin.cn.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("circle/circle-prototype.xml");
		TestA testA = cx.getBean("testA",TestA.class);
		System.out.println(testA);
	}
}
