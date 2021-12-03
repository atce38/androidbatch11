package com.abidingtech.waheed.Lecture_11_Abstract_cont;

 abstract class Teacher{
    String first_name,last_name;
    public String getFullName() {
        return first_name+" "+last_name;
    }
    public abstract int getMonthlySalary();
}

class PTeacher extends Teacher{

    int annualSalary;


    @Override
    public int getMonthlySalary() {
        return annualSalary/12;
    }
}
class VTeacher extends Teacher{

    int hours_worked_annually,per_hour_salary;
    public int getMonthlySalary() {
        return (hours_worked_annually*per_hour_salary)/12;
    }
}
public class Main {
    public static void main(String[] args) {
        PTeacher pTeacher=new PTeacher();
        pTeacher.first_name="Ali";
        pTeacher.last_name="Abbas";
        pTeacher.annualSalary=84000;

        System.out.println(pTeacher.getFullName());
        System.out.println(pTeacher.getMonthlySalary());

        VTeacher vTeacher=new VTeacher();
        vTeacher.first_name="Hassan";
        vTeacher.last_name="Raza";
        vTeacher.hours_worked_annually=400;
        vTeacher.per_hour_salary=50;

        System.out.println(vTeacher.getFullName());
        System.out.println(vTeacher.getMonthlySalary());
    }
}
