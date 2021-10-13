// 21. Fibonacci Series program
package com.Manoj;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = in.nextInt();
        int num1=0,num2=1;
        int count=0;
        while(count<=n){
            System.out.println(num1 + " ");
            int temp = num2+num1;
            num1 = num2;
            num2 = temp;
            count++;
        }
    }
}
