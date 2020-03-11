package com.methodoverriding;

public class Emp extends EmpDetails {
	public void fetchEmpDetails() {
		System.out.println("512");
	}
	public void empName(String name) {
		System.out.println("Krishnan");
	}
	public static void main(String[] args) {
		Emp e = new Emp();
		e.empName("Krishnan");
		e.fetchEmpDetails();
	}

	

}
