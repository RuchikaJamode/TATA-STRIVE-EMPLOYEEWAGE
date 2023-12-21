package com.bridgelabz.employeewage;
import java.util.Random;
import java.util.Scanner;
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
		//UC2
		
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
		//UC3
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
    //program UC4
   
String employeetype="fulltime";
int wageperHour=20;
int fulldayhr=8;
int hrworked='8';{

   switch(employeetype) {
   case"fulltime":
	   if(hrworked==fulldayhr) {
		   int fulltimedailywage=wageperHour+hrworked;
		   System.out.println("fulltime daily wage=Rs  "+fulltimedailywage);
	   }
	   else {
		   System.out.println("fulltime worked 8 hrs wage=Rs  ");
	   }
	   break;
   case"parttime":
	   if(hrworked==fulldayhr) {
		   int parttimedailywage=wageperHour+hrworked;
		   System.out.println("parttime daily wage=Rs  "+parttimedailywage);
	   }
	   else {
		   System.out.println("parttime worked 8 hrs wage=Rs  ");
	   }
	   break;
	  default:
		  System.out.println("invalid.");
		  break;
   }
	   
//uc5
int wagePerHour = 20;
int fullDayHours = 8;
int partTimeHours = 4; // Assuming part-time work is for 4 hours
int workingDaysPerMonth = 20;

String employeetype1 = "fulltime"; // Change to "part-time" as needed

int totalWage = 0;{

switch (employeetype1) {
    case"fulltime":
        for (int i = 0; i < workingDaysPerMonth; i++) {
            totalWage += wagePerHour * fullDayHours;
        }
        System.out.println("Full-time employee's monthly wage: rs" + totalWage);
        break;
    case"parttime":
        for (int i = 0; i < workingDaysPerMonth; i++) {
            totalWage += wagePerHour * partTimeHours;
        }
        System.out.println("Part-time employee's monthly wage: rs" + totalWage);
        break;
    default:
        System.out.println("Invalid employee type..");
        break;
}
//UC6
int wagePerHour1 = 20;
int fullDayHours1 = 8;
int partTimeHours1 = 4; // Assuming part-time work is 4 hours

int totalWorkingDays = 20;
int maxWorkingHours = 100;

int totalHoursWorked = 0;
int totalDaysWorked = 0;
int totalWage1 = 0;

while (totalHoursWorked < maxWorkingHours && totalDaysWorked < totalWorkingDays) {
    int remainingHours = maxWorkingHours - totalHoursWorked;
    int remainingDays = totalWorkingDays - totalDaysWorked;

    switch (totalHoursWorked < maxWorkingHours && totalDaysWorked < totalWorkingDays ? "continue" : "stop") {
        case "continue":
            int dailyWage = 0;

            // Check if it's a full-time or part-time day
            if (totalHoursWorked % fullDayHours1 == 0) {
                if (remainingHours >= fullDayHours1) {
                    dailyWage = wagePerHour1 * fullDayHours1;
                    totalHoursWorked += fullDayHours1;
                } else {
                    dailyWage = wagePerHour1 * remainingHours;
                    totalHoursWorked += remainingHours;
                }
            } else {
                if (remainingHours >= partTimeHours1) {
                    dailyWage = wagePerHour1 * partTimeHours1;
                    totalHoursWorked += partTimeHours1;
                } else {
                    dailyWage = wagePerHour1 * remainingHours;
                    totalHoursWorked += remainingHours;
                }
            }

            totalDaysWorked++;
            totalWage1 += dailyWage;

            System.out.println("Day " + totalDaysWorked + ": Wage - $" + dailyWage);
            break;
        case "stop":
            break;
        default:
            break;
    }
}

System.out.println("\nTotal wage for " + totalDaysWorked + " days worked and " + totalHoursWorked + " hours worked: $" + totalWage1);
}
	   
}
}



	
