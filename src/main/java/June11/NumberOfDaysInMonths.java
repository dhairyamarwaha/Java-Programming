package June11;

import java.util.Scanner;

public class NumberOfDaysInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the month (eg. Jan = 1) : ");
        int month = sc.nextInt();

        daysInMonth(month);

    }

    private static void daysInMonth(int month) {
        if (month == 2){
            int monthDays = 28;
            System.out.println("There are " + monthDays + " days in the month of February");

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            int monthDays = 30;
            System.out.println("There are " + monthDays + " days in the entered month");

        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            int monthDays = 31;
            System.out.println("There are " + monthDays + " days in the entered month");
        } else {
            System.out.println("Please enter a valid month number from 1-12");
        }
    }
}
