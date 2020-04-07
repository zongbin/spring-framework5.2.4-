package com.zongbin.cn.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {
public static void main(String[] args){
	new ClassPathXmlApplicationContext("circle/circle-constructor.xml");
}
}
