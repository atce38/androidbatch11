package com.abidingtech.waheed.Lecture10AbstractClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Human human=new Male();
        human.drinking();
        human.eat();

        Common.studentList(new TestCallBack() {
            @Override
            public void getStudents(ArrayList<Student> students) {
            showStudents(students);
            }
        });

    }
    public static void showStudents(ArrayList<Student> students){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i).name+" /Age=>"+students.get(i).age);
        }

    }
}
