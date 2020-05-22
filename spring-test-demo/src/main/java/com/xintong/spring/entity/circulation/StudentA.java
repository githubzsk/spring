package com.xintong.spring.entity.circulation;

/**
 * @ClassName StudentA
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/15 10:57
 * @Version 1.0
 */
public class StudentA {
	private StudentB studentB;
	public StudentA(StudentB studentB){
		this.studentB = studentB;
	}

	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

	public StudentB getStudentB() {
		return studentB;
	}
}
