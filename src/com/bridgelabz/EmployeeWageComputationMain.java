package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputationMain {


    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program ...");
        EmployeeWage employee1 = new EmployeeWage();
        Random rd = new Random();
        employee1.getadata();
        int choice;
        for (int i = 0; i < employee1.numberOfWorkingDays&&employee1.totalHours<=employee1.workingHours; i++) {
            choice = rd.nextInt(3);
            switch (choice) {
                case 0:
                    employee1.employeePresent(i);
                    break;
                case 1:
                    employee1.employeeAbsent(i);
                    break;
                case 2:
                    employee1.employeePartTime(i);
                    break;
            }
            System.out.println();
        }
        employee1.display();
    }
}
