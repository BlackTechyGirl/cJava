package chapterTwo;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double sum = 0;
        double average = 0;
        double product =1;
        int smallest = 100;
        int largest = 0;

        for (int i = 1; i <=3 ; i++) {
            display();
            number = input.nextInt();

            sum+=number;
            average = sum/i;
            product *= number;
            smallest = Math.min(smallest,number);
            largest = Math.max(largest,number);
        }

        print("Sum: "+sum);
        print("Average: "+average);
        print("Product: "+product);
        print("largest: "+largest);
        print("Smallest: "+smallest);


    }
    public static void display(){
        System.out.println("Enter a number");
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
