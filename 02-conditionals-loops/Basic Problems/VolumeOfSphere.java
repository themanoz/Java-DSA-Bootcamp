// 17.Volume of Sphere program
package com.Manoj;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius :");
        double r = in.nextDouble();
        double v = 4/3* Math.PI*r*r*r;
        System.out.println("Volume of Sphere : "+v);

    }
}
