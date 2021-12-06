package com.abidingtech.waheed.Lecture_12_Quiz;

public class Product {
    int id,available_qty;
    double price;
    String name,category,details;
    boolean is_active;

    public Product(int id,String name, String category, String details, int available_qty, double price,  boolean is_active) {
        this.id = id;
        this.available_qty = available_qty;
        this.price = price;
        this.name = name;
        this.category = category;
        this.details = details;
        this.is_active = is_active;
    }
}
