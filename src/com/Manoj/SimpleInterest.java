// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.Manoj;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double P,T,R;
        System.out.println("Enter principle: ");
        P =input.nextDouble();
        System.out.println("Enter time: ");
        T = input.nextDouble();
        System.out.println("Enter rate:");
        R = input.nextDouble();
        System.out.println("Simple Interest is: "+ (P*T*R)/100);
    }
}
