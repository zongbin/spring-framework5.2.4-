package com.zongbin.cn.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("factorybean/car-factory-bean.xml");
		Car car = ac.getBean("car", Car.class);
		Car car1 = ac.getBean("car", Car.class);
		CarFactoryBean obj = (CarFactoryBean) ac.getBean("&car");
		System.out.println(car);
	}
}
