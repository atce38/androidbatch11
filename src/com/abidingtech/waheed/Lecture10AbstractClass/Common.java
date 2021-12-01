package com.abidingtech.waheed.Lecture10AbstractClass;

import java.util.ArrayList;

public class Common {
    public static void studentList(TestCallBack callBack){
        ArrayList<Student> students=new ArrayList<>();
        for (int i=1;i<=10;i++)
            students.add(new Student("Student"+i,i));

        callBack.getStudents(students);
    }
}
