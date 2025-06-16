package June9.archives;

import java.util.Scanner;

public class MultiplicationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number whose table you wish to print : ");
        int number = sc.nextInt();

        System.out.print("Please enter the number till you want to print the table to : ");
        int lastNumber = sc.nextInt();

        table(number, lastNumber);
    }
    private static void table(int number, int lastNumber){
        for (int i = 1; i <= lastNumber; i++){
            int product = (int)(i * number);
            System.out.println(number + "x" + i + "=" + product);
        }
    }
}
