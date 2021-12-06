package com.abidingtech.waheed.Lecture10AbstractClass;

import com.abidingtech.waheed.Lecture_11_Abstract_cont.FunctionProgress;
import com.abidingtech.waheed.Lecture_12_Quiz.Product;
import com.abidingtech.waheed.Lecture_12_Quiz.ProductCallback;

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

    public static void getProducts(ProductCallback callback){
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product(1,"Some Product","Some Category",
                "Some Details",120,450,false));
        products.add(new Product(2,"Some Variant","Some Category",
                "Some Variant Details",420,150,true));
        products.add(new Product(3,"Base Product","Base Category",
                "Some Base Details",820,50,false));

        products.add(new Product(4,"شلغم سوپ 3 کلو کارٹن 10 پیکٹ","Some Category",
                "شلغم سوپ 6 کلو کارٹن 10 پیکٹ شلغم سوپ مولی برانڈ کی ایک اکنومیکل پراڈکٹ ھے جو دیسی صابن ہونے کے ساتھ ساتھ معیاری اور سستا صابن ہے پچھلے ۱۵ سالوں سے شلغم سوپ کے صارفین اس معیار اور قیمت سے مطمؑن ہیں اور مستقل استعمال کر رہے ہیں",1820,20,true));
        products.add(new Product(5,"عبرود فروٹی سوپ","Some Category",
                "عبرود فروٹی سوپ",1200,48,true));

        products.add(new Product(6,"مولی ڈش واش لیکویڈ 250 ملی لیٹر","Some Category",
                "عبرود فروٹی سوپ",440,35,true));

        products.add(new Product(7,"Adrak powder","Some Category",
                "Adrak powder",10,450,true));

        callback.fetchProducts(products);

    }


}
