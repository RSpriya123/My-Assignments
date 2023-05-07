package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Student Name : xyz");
		
	}
	public void studentDept()
	{
		System.out.println("Student Department : Computer Science");
		
	}
	public void studentId()
	{
		System.out.println("Student ID : S1234");
		
	}
	
	public static void main(String[] args) {
		
        Student obj = new Student();
        obj.collegeName();
        obj.collegeCode();
        obj.CollegeRank();
        obj.deptName();
        obj.studentName();
        obj.studentDept();
        obj.studentId();
	}

}
