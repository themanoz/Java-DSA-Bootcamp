// 5.Take 2 numbers as input and print the largest number.
package com.Manoj;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         //Take input
        System.out.println("Enter number:");
        int number1 = in.nextInt();
        System.out.println("Enter one more:");
        int number2 = in.nextInt();

        // Using if else to check which one is largest
        if(number1==number2){
            System.out.println("Both are Equal");
        }
        else if(number1>number2){
            System.out.println(number1+ " is largest!");
        }else {
            System.out.println(number2+ " is largest!");
        }
    }
}
