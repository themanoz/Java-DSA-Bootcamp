// 18.Volulme of Pyramid program
package com.Manoj;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height  : ");
        double h  = in.nextDouble();
        System.out.println("Enter width :");
        double w = in.nextDouble();
        System.out.println("Enter length :");
        double l = in.nextDouble();
        double v = (l*w*h)/3;
        System.out.println("Volume of Pyramid: "+v);
    }
}
