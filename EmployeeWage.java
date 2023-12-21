package com.bridgelabz.employeewage;
import java.util.Random;
public class EmployeeWage {

	public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage computation program");
		 int present=1;
		Random random=new Random();
		int randomno=random.nextInt(2);
	
		if(randomno==present) {
			System.out.println("employee is present");
			
		}
		else {
		
		System.out.println("employee is absent");
	}
	}
}