// 14 .Volume of Cone program
package com.Manoj;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = in.nextDouble();
        System.out.print("Enter height: ");
        double h = in.nextDouble();
        double v = (Math.PI*r*r*h)/3;
        System.out.println("Volume of Cone : "+ v);
    }
}
