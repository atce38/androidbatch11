package com.abidingtech.waheed.Lecture13_Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int[] a={1,9,12};
        try {
            System.out.println(a[3]);
        }catch (ArithmeticException ex){
            System.out.println("I am Arithmetic Exception");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Usamas Message");
        }finally {
            System.out.println("Finally will executed");
        }


    }
}
