package com.company;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        float x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Input float for circle: ");
        x = in.nextFloat();
        circle c1 = new circle();
        c1.view();
        circle c2 = new circle(x);
        c2.view();
        System.out.println("Input 2 float for ring: ");
        x = in.nextFloat();
        y = in.nextFloat();
        ring r1 = new ring();
        r1.view();
        ring r2 = new ring(x, y);
        r2.view();
        System.out.println("Radius of internal circle is " + r2.internal_rad());
        System.out.println("Radius of external circle is " + r2.external_rad());
        System.out.println("Square of ring is  " + r2.square());
    }
}