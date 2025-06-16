package June11;

import java.util.Scanner;

public class DetailedAgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter today's date : ");
        int todaysDate = sc.nextInt();

        System.out.print("Please enter the number of the current month : ");
        int currentMonth = sc.nextInt();

        System.out.print("Please enter the current year : ");
        int currentYear = sc.nextInt();

        System.out.print("Please enter the date of your birth : ");
        int birthDate = sc.nextInt();

        System.out.print("Please enter the number of your birth month : ");
        int birthMonth = sc.nextInt();

        System.out.print("Please enter your birth year : ");
        int birthYear = sc.nextInt();

        ageCalculator(todaysDate, currentMonth, currentYear, birthDate, birthYear, birthMonth);
    }

    private static void ageCalculator(int todaysDate, int currentMonth, int currentYear, int birthDate, int birthYear, int birthMonth) {
        int yearDifference = currentYear - birthYear;
        int yearIntoDays = (int)(yearDifference * 365);
        if (currentMonth == 2){
            int monthDays = 28;
            int monthDifference = (int) (currentMonth - birthMonth);
            int monthIntoDays = (int)(monthDifference);

        } else if (currentMonth == 4 || currentMonth == 6 || currentMonth == 9 || currentMonth == 11) {
            int monthDays = 30;
            int monthDifference = (int) (currentMonth - birthMonth);

        } else if (currentMonth == 1 || currentMonth == 3 || currentMonth == 5 || currentMonth == 7 || currentMonth == 8 || currentMonth == 10 || currentMonth == 12) {
            int monthDays = 31;
            int monthDifference = (int)(currentMonth - birthMonth);
        }
    }
}


