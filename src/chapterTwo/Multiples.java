package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        print("Number 1: ");
        int num1 = input.nextInt();

        print("Number 2: ");
        int num2 = input.nextInt();

        double tripled = Math.pow(num1, 3);
        double doubled = Math.pow(num2, 2);

        if(tripled%doubled==0) print("Multiple");
        else print("Not a multiple");
    }
    public static void display(){
        System.out.println("Enter a number");
    }
    public static void print(String message) {
        System.out.println(message);
    }

}
