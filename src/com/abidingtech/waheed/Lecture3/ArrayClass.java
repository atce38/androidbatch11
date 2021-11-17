package com.abidingtech.waheed.Lecture3;

import com.abidingtech.waheed.login.login;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClass extends login {

    public static void main(String[] args) {
        ArrayList<String> students;
        students=new ArrayList<>();
        String name="";
        int age=10;
        String className="";
        students.add("Name:"+name+" Age:"+age+" class:"+className);

        for (int i=0;i<students.size();i++)
        {

            if(i==2)
                continue;
            System.out.println(students.get(i));
        }

        System.out.println(string());

        Scanner scn=new Scanner(System.in);
        
        float val=scn.nextFloat();
        System.out.println(val);

    }
}
