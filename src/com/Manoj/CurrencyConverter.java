 // 6.Input currency in rupees and output in USD.
package com.Manoj;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // take input
        System.out.println("Enter amount you want to convert to $ :");
        double inr=in.nextFloat();
        System.out.println(inr + " in USD $ " +(0.013)*inr);

    }
}
