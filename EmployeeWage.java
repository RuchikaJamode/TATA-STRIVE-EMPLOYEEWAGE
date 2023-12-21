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
		int fullTimeHours = 8;
        int partTimeHours = 4; // Assuming part-time work is 4 hours

        int wagePerHour = 20;

        // Calculate wages
        int fullTimeWage = calculateDailyWage(fullTimeHours, wagePerHour);
        int partTimeWage = calculateDailyWage(partTimeHours, wagePerHour);

        System.out.println("Full-time employee's daily wage: Rs" + fullTimeWage);
        System.out.println("Part-time employee's daily wage: Rs" + partTimeWage);
    }

    // Method to calculate daily wage
    public static int calculateDailyWage(int hoursWorked, int wagePerHour) {
        return hoursWorked * wagePerHour;
    }


	}
	
