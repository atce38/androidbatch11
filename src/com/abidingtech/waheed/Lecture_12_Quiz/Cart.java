package com.abidingtech.waheed.Lecture_12_Quiz;

import java.util.ArrayList;

public class Cart {
    double sub_total;
    ArrayList<CartItem> items;

    public double getSub_total() {
        double total=0;

        for (CartItem item:items)
            total +=item.price*item.selected_qty;

        return total;
    }

}
