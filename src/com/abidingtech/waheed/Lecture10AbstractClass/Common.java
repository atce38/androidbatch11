package com.abidingtech.waheed.Lecture10AbstractClass;

import com.abidingtech.waheed.Lecture_11_Abstract_cont.FunctionProgress;

import java.util.ArrayList;

public class Common {
//    Previous Old Method
    public static void studentList(TestCallBack callBack){
        ArrayList<Student> students=new ArrayList<>();
        for (int i=1;i<=10;i++) {

            students.add(new Student("Student"+i,i));
        }

        callBack.getStudents(students);
    }
//    New Method

    public static void validateAge(int age,FunctionProgress progress){
        if(age <18)
            progress.onFailed("You are UnderAge to Qualified");
        else
            progress.onSuccess("Yes You are Qualified");

    }


}
