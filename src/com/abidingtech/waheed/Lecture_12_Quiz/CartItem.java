package com.abidingtech.waheed.Lecture_12_Quiz;

public class CartItem extends Product{
    int selected_qty;

    public double getSubTotal() {
        return selected_qty*price;
    }
}
