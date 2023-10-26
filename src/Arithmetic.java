import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        display();
        int number1 = input.nextInt();

        display();
        int number2 = input.nextInt();

        double firstSquare = Math.pow(number1, 2);
        double secondSquare = Math.pow(number2, 2);

        double sum = firstSquare+secondSquare;
        double difference =firstSquare-secondSquare;

        print("Square of first: " + firstSquare);
        print("Square of second: " + secondSquare);
        print("Sum of square: " + sum);
        print("Difference of square: " + difference);

    }

    public static void display(){
        System.out.println("Enter a number");
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
