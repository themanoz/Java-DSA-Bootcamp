// 25.Sum of digits of number  program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = in.nextInt();
        int sum =0;
        while(num>0){
            int rem = num%10;
            sum = sum +rem;
            num/=10;
        }
        System.out.println(sum);
    }
}
