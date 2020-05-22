package com.xintong.spring.entity.extend;

import org.springframework.beans.factory.DisposableBean;

/**
 * @ClassName Parent
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/16 16:49
 * @Version 1.0
 */
public class Parent implements DisposableBean {
	public Parent(){
		System.out.println("parent 无参构造");
	}

	@Override
	public void destroy() throws Exception {
		
	}
}
