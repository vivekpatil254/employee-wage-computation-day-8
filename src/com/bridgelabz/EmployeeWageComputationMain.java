package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputationMain {
    int totalHours=0, wagePerHour = 20, fullDayHours = 8, partTimeHours = 4, wagePerDay = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program ...");
        EmployeeWageComputationMain employee1 = new EmployeeWageComputationMain();
        Random rd = new Random();
        int choice;
        for (int i = 0; i < 20&&employee1.totalHours<=100; i++) {
            choice = rd.nextInt(3);
            switch (choice) {
                case 0:
                    System.out.println("day "+(i+1)+" employee is present");
                    employee1.wagePerDay = employee1.wagePerHour * employee1.fullDayHours;
                    employee1.totalHours=employee1.totalHours+employee1.fullDayHours;
                    System.out.println("The employee wage is : " + employee1.wagePerDay);
                    System.out.println("number of hours : "+employee1.totalHours);
                    break;
                case 1:
                    System.out.println("day "+(i+1)+" employee is absent");
                    System.out.println("The employee wage is : 0 ");
                    System.out.println("number of hours : "+employee1.totalHours);
                    break;
                case 2:
                    System.out.println("day "+(i+1)+" employee is part time worker");
                    employee1.wagePerDay = employee1.wagePerHour * employee1.partTimeHours;
                    employee1.totalHours=employee1.totalHours+employee1.partTimeHours;
                    System.out.println("number of hours : "+employee1.totalHours);
                    System.out.println("The employee wage is : " + employee1.wagePerDay);
            }
            System.out.println();
        }
    }
}
