package com.zongbin.cn.replaced.test;

import com.zongbin.cn.replaced.bean.TestChangeMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReplacerMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("replaced/replacedTest.xml");
		TestChangeMethod test = ac.getBean("testChangeMethod", TestChangeMethod.class);
		test.changeMe();
	}
}
