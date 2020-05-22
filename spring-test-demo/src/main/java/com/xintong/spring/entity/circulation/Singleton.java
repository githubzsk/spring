package com.xintong.spring.entity.circulation;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/18 13:49
 * @Version 1.0
 */
public class Singleton {
	private String name;
	private Integer age;

	public Singleton(){
		System.out.println("Singleton构造...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
