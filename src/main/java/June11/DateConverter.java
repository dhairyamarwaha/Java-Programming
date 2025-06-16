package June11;

import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter today's date : ");
        int date = sc.nextInt();

        System.out.print("Please enter the current month : ");
        int month = sc.nextInt();

        System.out.print("Please enter the current year : ");
        int year = sc.nextInt();

        DateOrganiser(date, month, year);
    }

    private static void DateOrganiser(int date, int month, int year) {
        System.out.println("The entered date is : " + date +"/" + month + "/" + year);
    }
}
