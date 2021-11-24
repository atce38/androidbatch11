package com.abidingtech.waheed.Lecture7;

import com.abidingtech.waheed.Lecture6.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Usama",45);

//        System.out.println(student.name+"/Age="+student.age);
        student.result();
        Student student1=new Student();
        student1.setName("Hassan");
        student1.setAge(23);

        System.out.println(student1.getName()+"/Age=>"+student1.getAge());
    }
}
