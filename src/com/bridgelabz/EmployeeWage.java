package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWage {
        String companyName;
        int totalHours=0, totalWage=0, wagePerHour, fullDayHours = 8, partTimeHours = 4, wagePerDay = 0,presentDayCount=0,absentDayCount=0,partTimeDayCount=0;
        int numberOfWorkingDays,workingHours;
            void getadata()
            {
                Scanner scanner =new Scanner(System.in);
                System.out.println("Enter company name  :  ");
                companyName=scanner.next();
                System.out.println("Enter wage per hour : ");
                wagePerHour=scanner.nextInt();
                System.out.println("Enter number of working days for company : ");
                numberOfWorkingDays = scanner.nextInt();
                System.out.println("Enter number of maximum hours for company : ");
                workingHours=scanner.nextInt();
            }
            public void display()
            {
                System.out.println("The employee Present day are  : "+presentDayCount);
                System.out.println("The part time day are         : "+partTimeDayCount);
                System.out.println("The employee absent day are   : "+absentDayCount);
                System.out.println("Total wages for month are     : "+totalWage);
                System.out.println("total number of hours         : "+totalHours);
            }


            public void employeePresent(int i)
            {
                System.out.println("day "+(i+1)+" employee is present");
                wagePerDay = wagePerHour * fullDayHours;
                totalHours=totalHours+fullDayHours;
                totalWage=totalWage+wagePerDay;
                presentDayCount++;
            }
             public void employeeAbsent(int i)
             {
                 System.out.println("day "+(i+1)+" employee is absent");
                 absentDayCount++;
             }
             public void employeePartTime(int i)
             {

                 System.out.println("day "+(i+1)+" employee is part time worker");
                 wagePerDay = wagePerHour * partTimeHours;
                 totalWage=totalWage+wagePerDay;
                 totalHours=totalHours+partTimeHours;
                 partTimeDayCount++;
             }
}
