package com.abidingtech.waheed.usamamasood;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {
    static Scanner inp=new Scanner(System.in);
    static ArrayList<Student> studentlist =new ArrayList<>();
    static int i=0;
    public static void main(String[] args) {
        System.out.println("How many objects you want to create *20* is must :");
        int no= inp.nextInt();
        inp.nextLine();
          creatObjects(no);
        output(no);
    }
    static void output(int a){
        if(a!=0) {
            System.out.print((i+1) + " Student name is ");
            studentlist.get(i).display();
            i++;
            output(a-1);
        }
    }
    static void creatObjects(int a) {
        if (a!=0) {
            Student st = new Student();
            System.out.println("Enter Student Name :");
            st.name = inp.nextLine();
            System.out.println("Enter Student Age :");
            while (!inp.hasNextInt()||inp.nextInt()<0){
                System.out.println("Only integer value Enter. Try Again :");
             inp.next();
            }
            st.age = inp.nextInt();
            inp.nextLine();
            studentlist.add(st);
            creatObjects(a - 1);
        }
    }
}

