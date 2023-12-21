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
		
		int wageperhr=20;
		int fulldayhr=8;
		int randomdailywage;
		
		if(fulldayhr==8) {
			randomdailywage=wageperhr+fulldayhr;
			System.out.println("employee daily wage is: Rs  "+randomdailywage);
			
		}
		else {
		
		System.out.println("invalid");
	}
	}
	}
