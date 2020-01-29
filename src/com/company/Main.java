package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age;
        String nationality;
        String education;
        Information info=new Information();
        System.out.println("Enter your age");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        System.out.println("Your nationality?");
        nationality = input.next();
        System.out.println("Education?");
        education = input.next();
        try {
            info.Age(age);
        } catch (HumanExceptions e1) {
            e1.printStackTrace();
        }
        try {
            info.Nationality(nationality);
        } catch (HumanExceptions e2) {
            e2.printStackTrace();
        }
        try {
            info.Education(education);
        } catch (HumanExceptions e3) {
            e3.printStackTrace();
        }
    }
}
