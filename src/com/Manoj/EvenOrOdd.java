// 1.Check whether the number is even or odd
package com.Manoj;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}