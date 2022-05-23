package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program ...");
        EmployeeWageComputationMain employee1 =new EmployeeWageComputationMain();
        Random rd = new Random();

        int choice = rd.nextInt(2);


        switch (choice) {
            case 0:
                System.out.println("employee is present");
                break;
            case 1:
                System.out.println("employee is absent");
                break;
        }
    }
}
