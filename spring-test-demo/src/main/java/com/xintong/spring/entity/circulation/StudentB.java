package com.xintong.spring.entity.circulation;

/**
 * @ClassName StudentB
 * @Description TODO
 * @Author zsk
 * @Date 2020/1/15 10:58
 * @Version 1.0
 */
public class StudentB {
	private StudentC studentC;
	public StudentB(StudentC studentC){
		this.studentC = studentC;
	}

	public void setStudentC(StudentC studentC) {
		this.studentC = studentC;
	}

	public StudentC getStudentC() {
		return studentC;
	}
}
