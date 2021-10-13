package com.Manoj;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  num = in.nextInt();
        EvenOdd(num);
    }

    static void EvenOdd(int num) {
        if(num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
