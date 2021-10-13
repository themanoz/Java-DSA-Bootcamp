// 16.Volume of Cylinder program
package com.Manoj;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double r = in.nextDouble();
        System.out.println("Enter height : ");
        double h = in.nextDouble();
        double v = Math.PI*r*r*h;
        System.out.println("Volume of Cylinder : " + v);
    }
}
