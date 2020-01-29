package com.company;

public class Information {
        int age;
        String nationality;
        String education;

        public void Age(int age) throws HumanExceptions{
            if (age<23){
                System.out.println("Your age is under limit");
                throw new HumanExceptions();
            }
            else {
                System.out.println("Your age is allowed");
            }
            this.age = age;
        }
        public void Nationality(String nationality) throws HumanExceptions{
            if (nationality.equals("iranian")){
                System.out.println("You are Iranian.");
            }
            else {
                System.out.println("You aren't Iranian");
                throw new HumanExceptions();
            }
            this.nationality = nationality;
        }
        public void Education(String education) throws HumanExceptions{
            if (education.equals("bachelor")){
                System.out.println("You have enough education!");
            }
            else {
                System.out.println("You haven't bachelor or more");
                throw new HumanExceptions();
            }
            this.education = education;
        }
}
