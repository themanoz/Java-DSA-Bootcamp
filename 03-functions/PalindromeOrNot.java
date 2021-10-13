package com.Manoj;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        palidromeOrNot(num);
    }

    static void palidromeOrNot(int num) {
        int rev=0;
        int temp = num;
        while(num>0){
            rev = rev*10+num%10;
            num/=10;
        }
        if(rev == temp){
            System.out.println("palindrome!");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
