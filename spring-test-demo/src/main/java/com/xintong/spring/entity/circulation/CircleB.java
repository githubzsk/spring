package com.xintong.spring.entity.circulation;

import org.springframework.stereotype.Component;

/**
 * @ClassName CircleB
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/17 10:55
 * @Version 1.0
 */
@Component
public class CircleB {
	private CircleA circleA;
	public CircleB(){
		System.out.println("CircleB构造方法被执行.....");
	}

	public CircleA getCircleA() {
		return circleA;
	}

	public void setCircleA(CircleA circleA) {
		this.circleA = circleA;
	}
}
