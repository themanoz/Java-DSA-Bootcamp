package com.Manoj;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  2 numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Sum of 2 numbers: " +sum(num1,num2));
    }

    static int sum(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }
}
