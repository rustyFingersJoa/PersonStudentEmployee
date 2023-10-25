package PersonStudentEmployee;

import java.lang.CloneNotSupportedException;
import java.lang.Comparable;
import java.lang.Cloneable;

public class Student extends Person implements Comparable<Student>, Cloneable{
	
	private int studentNumber;
	
	public Student() {
		super();
		studentNumber = 0;
	}
	
	public Student(String name, int age, int studentNumber) {
		super(name, age);
		this.setStudentNumber(studentNumber);
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	

	@Override
	public int compareTo(Student o) {
		if (this.studentNumber > o.studentNumber)
			return 1;
		else if (this.studentNumber < o.studentNumber)
			return -1;
		return 0;
	}
	
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + studentNumber;
	}
	
	//override
	public boolean equals(Object obj) {
		if (obj instanceof Student)
			return this.studentNumber == ((Student)obj).studentNumber;
		else
			return false;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}



}
