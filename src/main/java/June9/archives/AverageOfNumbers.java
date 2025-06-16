package June9.archives;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you wish to find the average of : ");
        int number = sc.nextInt();

        System.out.println("The average of the entered numbers is : " + inputNumbers(number));
    }

    private static double inputNumbers(int number) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int index = 1; index <= number; index++) {
            System.out.print("Enter the " + index + " number : ");

            sum += sc.nextDouble();
        }
        return sum / number;
    }
}