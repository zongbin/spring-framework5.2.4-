package com.zongbin.cn.customtag;

import cn.zongbin.com.customtag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomTagTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("customtag/my-test-user.xml");
		User user = ac.getBean("testBean", User.class);
		System.out.println(user);
	}
}
