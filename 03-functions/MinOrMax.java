package com.Manoj;

import java.util.Scanner;

public class MinOrMax {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Max among 3 nums: "+largest(a,b,c));
        System.out.println("Min among 3 nums: "+smallest(a,b,c));
    }
    static int largest(int a, int b, int c) {
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max=c;
        }
        return max ;
    }

    static int smallest(int a, int b, int c) {
        int min = a;
        if(b<min){
            min= b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }

}
