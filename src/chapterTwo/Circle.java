package chapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = input.nextDouble();

        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Diameter: %.2f%n", 2*radius);
        System.out.printf("Circumference: %.2f%n", 2*Math.PI*radius);
        System.out.printf("Area: %.2f%n", Math.PI*Math.pow(radius, 2));
    }


}
