package com.abidingtech.waheed.usamamasood;

import java.util.ArrayList;

public class Student {
    ArrayList<String> subjects=new ArrayList<>();
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
      //  for (int i =0;i<subjects.size();i++) {
            System.out.println("This student having subjects are :" + subjects);
      //  }
        System.out.println("******************");
    }
}
