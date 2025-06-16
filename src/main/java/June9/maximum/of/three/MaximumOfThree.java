package June9.maximum.of.three;

import java.util.Scanner;

public class MaximumOfThree {
    Scanner sc = new Scanner(System.in);


     int firstNumber, secondNumber, thirdNumber;

    public void getNumbers() {
        System.out.print("Please enter the first number: ");
        firstNumber = sc.nextInt();  // Don't declare int again — just assign

        System.out.print("Please enter the second number: ");
        secondNumber = sc.nextInt();

        System.out.print("Please enter the third number: ");
        thirdNumber = sc.nextInt();
    }

    public int comparison() {
        int greatestNumber;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            greatestNumber = firstNumber;
        } else if (secondNumber >= thirdNumber) {
            greatestNumber = secondNumber;
        } else {
            greatestNumber = thirdNumber;
        }

        return greatestNumber;
    }
}