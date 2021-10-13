// 24.Check Leap Year Or Not program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter year:");
        int year = in.nextInt();
        if(year % 4==0 && year % 100==0 && year % 400 ==0){
            System.out.println("Leap year");
        }else if (year % 4==0 && year %100!=0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
