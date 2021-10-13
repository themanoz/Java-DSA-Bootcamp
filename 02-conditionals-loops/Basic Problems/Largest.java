// 25.Take integer inputs till the user enters 0 and print the largest number from all.
package com.Manoj;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,max=0;
        while(true){
            System.out.println("Enter  a number: ");
            num = in.nextInt();
            if(num>max) {
                max = num;
            }
            if(num==0){
                break;
            }
        }
        System.out.println("Largest number is :" + max);
    }
}
