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

            do {
                System.out.println("Enter Student Age in positive :");
                while (!inp.hasNextInt()) {
                    System.out.println("Only integer value Enter. Try Again :");
                    inp.next();
                }
                st.age = inp.nextInt();
            }while (st.age<0);
            inp.nextLine();
            int no;
            System.out.println("How many subjects you have :");
            no=inp.nextInt();
            inp.nextLine();
            for (int i=0;i<no;i++){
                System.out.println("Enter "+(i+1)+" subject :");
                st.subjects.add(inp.nextLine());
            }
            studentlist.add(st);
            creatObjects(a - 1);
        }
    }
}

