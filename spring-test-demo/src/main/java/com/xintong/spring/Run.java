package com.xintong.spring;


import com.xintong.spring.entity.MyConf;
import com.xintong.spring.entity.circulation.CircleA;
import com.xintong.spring.entity.circulation.CircleB;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Run
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/15 10:56
 * @Version 1.0
 */
public class Run {

	private BeanDefinition beanDefinition;
	FactoryBean factoryBean;
	BeanFactory beanFactory;

	static ApplicationContext applicationContext;
	//destruction
	DisposableBean disposableBean;
	DestructionAwareBeanPostProcessor destructionAwareBeanPostProcessor;
	public static void main(String[] args) {//
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//		CircleA circleA = (CircleA)context.getBean("circleA");
//		CircleB circleB = circleA.getCircleB();
//		System.out.println(circleB);
		HashMap map= new HashMap();
		map.put("","");
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConf.class);
		CircleA bean = ac.getBean(CircleA.class);
		System.out.println(bean);
		applicationContext.getBean("");
	}
}
