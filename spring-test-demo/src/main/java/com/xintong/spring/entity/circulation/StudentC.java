package com.xintong.spring.entity.circulation;

/**
 * @ClassName StudentA
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/15 10:57
 * @Version 1.0
 */
public class StudentC {
	private StudentA studentA;
	public StudentC(StudentA studentA){
		this.studentA = studentA;
	}

	public void setStudentA(StudentA studentA) {
		this.studentA = studentA;
	}

	public StudentA getStudentA() {
		return studentA;
	}
}
