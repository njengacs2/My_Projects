package com.njenga.employee.P01;

import java.util.Scanner;

public class employee {

	private String empName;
	private Integer empSal;

	public void getName(String en) {
		//en = "James";
		//es = 10000;
		  
	}

	public void calcSal(Integer es) {
		System.out.print("===============");

		if(es > 500){

			System.out.print("Employee Salary is 25000K");
		}
		else {
			System.out.print("Employee Salary is 20000K");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		
		String name = new String();
		employee emp = new employee();
		//emp.getName("James", 1000);
		
		System.out.println("enter employee name ");
		name = obj.nextLine();
		//name.getName("James");
		emp.calcSal(2300);
		
		



	}

	

}
