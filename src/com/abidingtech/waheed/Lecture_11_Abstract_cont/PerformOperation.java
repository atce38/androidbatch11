package com.abidingtech.waheed.Lecture_11_Abstract_cont;

public class PerformOperation {
    public static void main(String[] args) {

        Operation plus=new Operation() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };

        System.out.println("Plus Result=>"+plus.operate(45,50));

        Operation minus=new Operation() {
            @Override
            public int operate(int a, int b) {
                return a-b;
            }
        };

        System.out.println("Minus Result=>"+minus.operate(450,50));
    }
}
