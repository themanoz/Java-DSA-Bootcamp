package com.Manoj;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print(isPrime(num));
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}

