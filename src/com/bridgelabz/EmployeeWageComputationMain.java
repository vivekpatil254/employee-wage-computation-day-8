package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputationMain {
    int wagePerHour=20, fullDayHours=8,partTimeHours= 4, wagePerDay=0;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program ...");
        EmployeeWageComputationMain employee1 =new EmployeeWageComputationMain();
        Random rd = new Random();

        int choice = rd.nextInt(3);


        switch (choice) {
            case 0:
                System.out.println("employee is present");
                employee1.wagePerDay= employee1.wagePerHour* employee1.fullDayHours;
                System.out.println("The employee wage is : "+employee1.wagePerDay);
                break;
            case 1:
                System.out.println("employee is absent");
                System.out.println("The employee wage is : 0 ");
                break;
            case 2:
                System.out.println("employee is part time worker");
                employee1.wagePerDay= employee1.wagePerHour* employee1.partTimeHours;
                System.out.println("The employee wage is : "+employee1.wagePerDay);
        }
    }
}
