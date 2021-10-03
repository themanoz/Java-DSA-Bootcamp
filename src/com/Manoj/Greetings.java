// 02 Take name as input and print a greeting message for that name.
package com.Manoj;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = input.next();
        System.out.println("Hello "+name);
    }
}
