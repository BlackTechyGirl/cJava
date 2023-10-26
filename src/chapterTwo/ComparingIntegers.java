package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        Integer integer = number;

        double square = Math.pow(number, 2);

        if (number > 100 && square > 100) print("Greater than");
        if(number == 100 && square == 0) print("Equal to");
        if (number != 100 && square != 100) print("Not equal to");
        if (number < 100 && square < 100) print("Less than");


    }

    public static void print(String message) {
        System.out.println(message);
    }
}
