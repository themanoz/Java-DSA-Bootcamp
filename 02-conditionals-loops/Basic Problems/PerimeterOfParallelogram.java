// 10.Perimeter of parallelogram program
package com.Manoj;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of parallelogram : ");
        double b = in.nextDouble();
        System.out.print("Enter the side of parallelogram : ");
        double a = in.nextDouble();
        System.out.println("Perimeter of parallelogram :" + 2*(a+b));
    }
}
