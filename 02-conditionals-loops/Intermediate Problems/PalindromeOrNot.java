// 18.Find if a number is palindrome or not program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int rev=0;
        int temp = num;
        while(num>0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
            if(rev == temp){
                System.out.println("Palindrome");
            }else {
                System.out.println("Not palindrome");
            }
        
        System.out.println();
    }
}
