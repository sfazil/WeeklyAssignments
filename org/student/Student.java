package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("from studentName");
		
	}
	public void studentDept() {
		System.out.println("from studentDept");
		
	}
	public void studentId() {
		System.out.println("from studentId");
		
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		
		obj.deptName();
		
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
