// 5.Area of Parallelogram
package com.Manoj;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side 1 of parallelogram: ");
        double a = in.nextDouble();
        System.out.print("Enter side 2 of parallelogram: ");
        double b = in.nextDouble();
        System.out.println("Area of Parallelogram is :" + (a*b));
    }
}
