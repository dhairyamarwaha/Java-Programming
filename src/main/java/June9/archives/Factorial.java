package June9.archives;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number whose factorial you wish to find out : ");
        int number = sc.nextInt();

        factorial(number);
    }

    private static void factorial(int number) {
        for (int i = 1; i <= number; i++){
            int factorial = i;
            System.out.println(factorial);
        }
    }
}
