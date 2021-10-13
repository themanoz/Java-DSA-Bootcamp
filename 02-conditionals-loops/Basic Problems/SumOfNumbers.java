// 24.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package com.Manoj;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sum=0;
        while(true){
            System.out.println("Enter a number: ");
            num= in.nextInt();
            if(num==0){
                break;
            }
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
