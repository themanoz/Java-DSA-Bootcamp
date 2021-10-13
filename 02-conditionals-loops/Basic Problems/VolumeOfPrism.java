// 15.Volume of prism program
package com.Manoj;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of prism: ");
        double B = in.nextDouble();
        System.out.print("Enter the height of prism: ");
        double H = in.nextDouble();
        System.out.println("Volume of Prism :"+ B*H);

    }
}
