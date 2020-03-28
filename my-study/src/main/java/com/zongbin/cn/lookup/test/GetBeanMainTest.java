package com.zongbin.cn.lookup.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetBeanMainTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("lookup/lookupTest.xml");
		GetBeanTest test = ac.getBean("myTest", GetBeanTest.class);
		test.showMe();
	}
}
