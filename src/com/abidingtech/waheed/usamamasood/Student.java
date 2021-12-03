package com.abidingtech.waheed.usamamasood;

import java.util.ArrayList;

public class Student {
    String name;
    int age;
    ArrayList<String> subjects;
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
        System.out.println(subjects);

    }
}
