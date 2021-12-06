package com.abidingtech.waheed.Lecture_12_Quiz;

import com.abidingtech.waheed.Lecture10AbstractClass.Common;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Common.getProducts(new ProductCallback() {
            @Override
            public void fetchProducts(ArrayList<Product> products) {
                //Do Your Logic
            }
        });
    }
}
