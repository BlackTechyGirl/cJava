package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <=5 ; i++) {
            display();
            number = input.nextInt();

            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
        }

        print("largest: " + largest);
        print("smallest: " + smallest);
    }

    public static void display(){
        System.out.println("Enter a number");
    }

    public static void print(String message) {
        System.out.println(message);
    }

}
