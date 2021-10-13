// 20 .Total surface Area of Cube program
package com.Manoj;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of cube : ");
        double a = in.nextDouble();
        System.out.println("Total Surface Area of Cube : " + 6*a*a);
    }
}
