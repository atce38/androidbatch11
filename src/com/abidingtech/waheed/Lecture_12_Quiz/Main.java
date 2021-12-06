package com.abidingtech.waheed.Lecture_12_Quiz;

import com.abidingtech.waheed.Lecture10AbstractClass.Common;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> productList=new ArrayList<>();
    static ArrayList<CartItem> cartItems=new ArrayList<>();
    public static void main(String[] args) {
        Common.getProducts(new ProductCallback() {
            @Override
            public void fetchProducts(ArrayList<Product> products) {
                //Do Your Logic
                for (Product product: products) {
                    if(product.is_active)
                        productList.add(product);
                }
            }
        });

        showMenu();
    }
    private static void addToCart(Product product,int selected_quantity){
        CartItem cartItem=new CartItem();
        cartItem.id=product.id;
        cartItem.name=product.name;
        cartItem.price=product.price;
        cartItem.selected_qty=selected_quantity;
        cartItems.add(cartItem);

    }
    private static void showMenu() {
        for (Product product:productList) {
            System.out.println("id:"+product.id+", name:"+product.name+", Quantity:"+product.available_qty+", Price:"+product.price);

        }
        Cart cart=new Cart();
        cart.items=cartItems;//List or selected Products
        for (CartItem item:cart.items){
            System.out.println("id:"+item.id+", name:"+item.name+", Quantity:"+item.selected_qty+", Price:"+item.price);
        }
        System.out.println("====================================");
        System.out.println("Cart Total:"+cart.getSub_total());

        Scanner scanner=new Scanner(System.in);
        int selected_product=scanner.nextInt();
        int selected_quantity=scanner.nextInt();
        addToCart(productList.get(selected_product),selected_quantity);
    }
}
