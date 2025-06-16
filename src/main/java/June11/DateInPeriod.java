package June11;

import java.util.Scanner;

public class DateInPeriod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the date in the following format ddmmyyyy : ");
        int currentDate = sc.nextInt();

        System.out.print("Please enter the starting date of the period in ddmmyyyy : ");
        int startDate = sc.nextInt();

        System.out.print("Please enter the ending date of the period in ddmmyyyy : ");
        int endDate = sc.nextInt();

        isWithinPeriod(currentDate, startDate, endDate);
    }

    private static void isWithinPeriod(int currentDate, int startDate, int endDate) {

        if (currentDate >= startDate && currentDate <= endDate){
            System.out.println("The entered date lies in the period");
        }else {
            System.out.println("The entered date does not lie in the period");
        }
    }

}
