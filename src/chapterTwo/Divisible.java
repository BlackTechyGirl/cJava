package chapterTwo;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        print("Enter a number: ");
        int number = input.nextInt();
        if (number%3 ==0){
            print("Divisible by 3");
        }
        else {
            print("Not divisible by 3");
        }
    }

    public static void display(){
        System.out.println("Enter a number");
    }
    public static void print(String message) {
        System.out.println(message);
    }

}
