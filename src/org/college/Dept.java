package org.college;

public class Dept {
	private void deptName() {
		System.out.println("deptName=b.tech-cse");

	}
	public static void main(String[] args) {
		Dept d = new Dept();
		College c = new College();
		Student s= new Student();
		Hostel h = new Hostel();
		d.deptName();
		c.collegeName();
		c.colleageCode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentID();
		h.hostelName();
	}

}
