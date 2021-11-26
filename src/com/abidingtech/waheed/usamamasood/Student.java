package com.abidingtech.waheed.usamamasood;

public class Student {
    String name;
    int age;
    void display(){
        if (age<18){
            System.out.println(" "+name);
            System.out.println("This student is Under age :");
            System.out.println("Age is "+age);
        }
        else{
            System.out.println(" "+name);
            System.out.println("Age is "+age);
        }

    }
}
