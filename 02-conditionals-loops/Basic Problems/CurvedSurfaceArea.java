// 19.Curved Surface Area of Cylinder program
package com.Manoj;

import java.util.Scanner;

public class CurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius :");
        double r = in.nextDouble();
        System.out.println("Enter height :");
        double h = in.nextDouble();
        double c = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area of Cylinder: " +c);

    }
}
