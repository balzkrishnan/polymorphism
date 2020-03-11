package com.methodoverloading;

public class StudentDetails {
	public void student(int ID) {
		System.out.println("Enter student ID :");
	}
	public void student(String name) {
		System.out.println(name);
	}
	
	public void student(char Block,int phnNo) {
		System.out.println(phnNo);
		System.out.println(Block);
	}
	public static void main(String[] args) {
		StudentDetails Std = new StudentDetails();
		Std.student(236);
		Std.student("Bala");
		Std.student('A', 96553250);
	}

}
