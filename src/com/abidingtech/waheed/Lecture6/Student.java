package com.abidingtech.waheed.Lecture6;

public class Student {
    private String name;
    private int age;
    public Student(){
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void result(){
        System.out.println("Student Name= "+name);
        System.out.println("Student Age= "+age);
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
