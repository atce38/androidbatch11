package com.abidingtech.waheed.Lecture_12_Quiz;

import com.abidingtech.waheed.Lecture10AbstractClass.Common;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
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
    private static void addedToCart(Product product,int selected_quantity){
        CartItem cartItem=new CartItem();
        cartItem.id=product.id;
        cartItem.name=product.name;
        cartItem.price=product.price;
        cartItem.selected_qty=selected_quantity;
        cartItems.add(cartItem);

    }
    private static void showMenu() {
        for (int i=0;i<productList.size();i++) {
            Product product=productList.get(i);
            System.out.println("id:"+i+", name:"+product.name+", Quantity:"+product.available_qty+", Price:"+product.price);
        }
        System.out.println("====================================");
        System.out.println("Press 1 for Add to Cart");
        System.out.println("Press 2 for Empty Cart");
        System.out.println("Press 3 for view Cart");
        System.out.println("Press 4 for Exit");
        int selection=scanner.nextInt();
        if(selection ==1){
            addToCart();
        }
       else if(selection ==2){
            cartItems.clear();
            System.out.println("Cart is Empty Now");
            showMenu();
        }
       else if(selection ==3){
            viewCart();
        }
       else{
           System.exit(0);
        }

    }

    private static void addToCart() {

        System.out.println("====================================");
        System.out.println("Enter Product ID To Add it to Cart");
        int selected_product=scanner.nextInt();
        System.out.println("Enter Product Product Quantity");
        int selected_quantity=scanner.nextInt();
        scanner.nextLine();
        addedToCart(productList.get(selected_product),selected_quantity);
        System.out.println("Enter Product Product Quantity");
        System.out.println("Press 0 to goto Main Menu or Any number to continue shopping");
        int selected_opt=scanner.nextInt();
        if(selected_opt ==0)
            showMenu();
        else{
            addToCart();
        }
    }
    private static void viewCart() {
        System.out.println("Cart");
        System.out.println("====================================");
        if (cartItems.size()>0)
        {
            Cart cart=new Cart();
            cart.items=cartItems;//List or selected Products
            for (CartItem item:cart.items){
                System.out.println("id:"+item.id+", name:"+item.name+", Quantity:"+item.selected_qty+", Price:"+item.price+", SubTotal:"+item.getSubTotal());
            }
            System.out.println("====================================");
            System.out.println("Cart Total:"+cart.getGrandTotal());
        }else
            System.out.println("Cart is Empty");
        System.out.println("Press 0 to goto Main Menu");
        int selected_opt=scanner.nextInt();
        if(selected_opt ==0)
            showMenu();
        else{
            viewCart();
        }

    }

}
