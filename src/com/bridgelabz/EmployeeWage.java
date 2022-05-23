package com.bridgelabz;

public class EmployeeWage {

        int totalHours=0, wagePerHour = 20, fullDayHours = 8, partTimeHours = 4, wagePerDay = 0;
            public void employeePresent(int i)
            {
                System.out.println("day "+(i+1)+" employee is present");
                wagePerDay = wagePerHour * fullDayHours;
                totalHours=totalHours+fullDayHours;
                System.out.println("The employee wage is : " + wagePerDay);
                System.out.println("number of hours : "+totalHours);
            }
             public void employeeAbsent(int i)
             {
                 System.out.println("day "+(i+1)+" employee is absent");
                 System.out.println("The employee wage is : 0 ");
                 System.out.println("number of hours : "+totalHours);
             }
             public void employeePartTime(int i)
             {

                 System.out.println("day "+(i+1)+" employee is part time worker");
                 wagePerDay = wagePerHour * partTimeHours;
                totalHours=totalHours+partTimeHours;
                 System.out.println("number of hours : "+totalHours);
                 System.out.println("The employee wage is : " + wagePerDay);
             }
}
