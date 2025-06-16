package June12;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Please enter the second number : ");
        int secondNumber = sc.nextInt();

        swapWithoutThirdVariable(firstNumber, secondNumber);
    }

    private static void swapWithoutThirdVariable(int firstNumber, int secondNumber){
        firstNumber = firstNumber^secondNumber;
        secondNumber = firstNumber^secondNumber;
        firstNumber = firstNumber^secondNumber;

        System.out.println("The swapped number of the first number is : " + firstNumber);
        System.out.println("The swapped number of the second number is : " + secondNumber);
    }
}
