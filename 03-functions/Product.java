package com.Manoj;

import java.util.Scanner;
 public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Product of 2 numbers: " + product(num1,num2));
    }

    static int product(int num1, int num2) {
        int product = num1*num2;
        return product;
    }
}
