package week3.org.student;

import week3.org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("This is Student name() from Student class");
	}

	public void studentDept() {
	System.out.println("This is Student Department() from Student class");

	}
	
	public void studentId() {
		System.out.println("This is Student ID() from Student class");

	}

public static void main(String[] args) {
	
	Student stu=new Student();
	stu.collegeCode();
	stu.collegeName();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
	}
}

