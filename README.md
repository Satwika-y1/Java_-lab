# Java_-lab
package com.study;
class Administrator {  //parent class
	String name;
	int id;
	int roll;
}

class Teacher extends Administrator { 
	void display() {
		System.out.println("Name is " + name);
		System.out.println("ID is " + id);
	}
}

class Student extends Administrator {
	void show() {
		System.out.println("Name is " + name);
		System.out.println("Roll No is " + roll);
	}
}
public class Mains {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Seetha";
		t.id = 100;
		t.display();

		System.out.println();

		Student s = new Student();
		s.name = "Shalini";
		s.roll = 48;
		s.show();
	}
}
//Output
Name is Seetha
ID is 100

Name is Shalini
Roll No is 48
