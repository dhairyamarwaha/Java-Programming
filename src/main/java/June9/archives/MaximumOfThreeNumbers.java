package June9.archives;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Please enter the second number : ");
        int secondNumber = sc.nextInt();

        System.out.print("Please enter the third number : ");
        int thirdNumber = sc.nextInt();

        maximumOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println(maximumOfThreeNumbersV2(firstNumber, secondNumber, thirdNumber));

    }

    private static void maximumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The largest number is : " + firstNumber);
        } else if (secondNumber > thirdNumber) {
            System.out.println("The largest number is : " + secondNumber);
        } else {
            System.out.println("The largest number is : " + thirdNumber);
        }
    }

    private static int maximumOfThreeNumbersV2(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = firstNumber;
        if(secondNumber > largest){
            largest = secondNumber;
        }
        if( thirdNumber > largest){
            largest = thirdNumber;
        }
        return largest;
    }
}
