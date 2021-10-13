// 26.Kunal is allowed to go out with his friends only on
// the even days of a given month. Write a program to count the
// number of days he can go out in the month of August.
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class EvenDays {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int count =0;
        for (int i = 1; i <=31 ; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The number of days kunal can go out in the month of August are "+count);
    }
}
