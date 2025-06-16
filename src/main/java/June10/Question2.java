package June10;

import java.util.Scanner;

// Positive/Negative
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        natureOfNumber(number);
    }

    private static void natureOfNumber(int number) {
        if(number >= 0){
            System.out.println("The entered number is positive");
        } else{
            System.out.println("The entered number is negative");
        }
    }
}
