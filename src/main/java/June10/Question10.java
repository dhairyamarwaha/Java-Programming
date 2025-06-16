package June10;

import java.util.Scanner;

// Calculating the age
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your birth year : ");
        int birthYear = sc.nextInt();

        System.out.print("Please enter the current year : ");
        int year = sc.nextInt();

        ageCalculation(birthYear, year);
    }

    private static void ageCalculation(int birthYear, int year) {
        if (birthYear > year){
            System.out.println("Your year of birth can't be greater than the current year");
            return;
        }
        int age = year - birthYear;
        System.out.println("Your age is : " + age + " years");
    }
}
