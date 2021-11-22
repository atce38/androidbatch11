package com.abidingtech.waheed.Lecture4;

public class Main {
    int ab=45;
    int b=ab;
    String ac="Hello Class";
    String st=ac;
    final String NAME="HASSAN";

    public static void main(String[] args) {
     String [] a={"Hello","Class"};
     changeValue(a);
        System.out.println(a[0]);
        int ab='A';
        System.out.println(ab);

        System.out.println(sumAll(50,10));
        System.out.println(sumAll(50,10,15));
    }

    private static int sumAll(int ...arr) {
        int result=0;
        for (int a:arr)
             result +=a;
        System.exit(0);
        return result;
    }



    private static void changeValue(String[] a) {
        a[0]="Usama";
    }
}
