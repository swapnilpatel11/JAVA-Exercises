package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year Of Birth?");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line when press enter1

            System.out.println("What is your name? ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if(age>0&&age<=100){
                System.out.println("User Name: " + name);
                System.out.println("Age = " + age);
            }
            else {
                System.out.println("Invalid Value of age");
            }
        }else {
            System.out.println("Unable to parse the value of birth year");
        }


        scanner.close();
    }
}
