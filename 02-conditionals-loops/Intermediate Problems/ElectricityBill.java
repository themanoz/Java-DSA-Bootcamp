// 2. Calculate Electrictiy Bill
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of kwh used: ");
        double kwh = in.nextDouble();
        System.out.println("Enter the cost of kwh: ");
        double cost = in.nextDouble();
        System.out.println("Enter the number of days used: ");
        double days = in.nextDouble();
        double bill=0;
        if(kwh>0 && cost>0 && days>0){
            bill = kwh *cost;
            bill = bill/days;
            System.out.println("Electricity bill is: "+ bill);
        }else {
            System.out.println("invalid input");
        }
    }
}
