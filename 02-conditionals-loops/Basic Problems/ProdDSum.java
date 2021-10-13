// 22.Subtract the product and sum of digits of a number program
package com.Manoj;

import java.util.Scanner;

public class ProdDSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int rem,product =1,sum=0;
        while(num!=0){
            rem = num%10;
            product = product*rem;
            sum = sum+rem;
            num/=10;
        }
        System.out.println(product);
        System.out.println(sum);
        System.out.println(product-sum);
    }
}
