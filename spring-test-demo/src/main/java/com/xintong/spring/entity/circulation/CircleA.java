package com.xintong.spring.entity.circulation;

import org.springframework.stereotype.Component;

/**
 * @ClassName CircleA
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/17 10:55
 * @Version 1.0
 */
@Component
public class CircleA {
	private CircleB circleB;

	public CircleA(){
		System.out.println("CircleA构造方法被执行.....");
	}

	public CircleB getCircleB() {
		return circleB;
	}

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}
}
