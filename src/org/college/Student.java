package org.college;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("Name:M.Shiyamala");
	}

	public void studentDept() {
		System.out.println("Department:Mathematics");
	}

	public void studentId() {
		System.out.println("Id:1625");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.hostelName();
		s.studentDept();
		s.studentId();
		s.studentName();

	}

}
