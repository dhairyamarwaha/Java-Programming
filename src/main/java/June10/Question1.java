package June10;

import java.util.Scanner;
import java.lang.Math;

// Distance between 2 points
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x coordinate of the first point : ");
        int x1 = sc.nextInt();

        System.out.print("Enter the y coordinate of the first point : ");
        int y1 = sc.nextInt();

        System.out.print("Enter the x coordinate of the second point : ");
        int x2 = sc.nextInt();

        System.out.print("Enter the y coordinate of the second point : ");
        int y2 = sc.nextInt();

        distanceFormula(x1, y1, x2, y2);
    }

    private static void distanceFormula(int x1, int y1, int x2, int y2) {
        int xCoordinateDifference = (int) Math.pow(x2-x1, 2);
        int yCoordinateDifference = (int) Math.pow(y2-y1,2);
        int distance = (int) Math.sqrt(xCoordinateDifference + yCoordinateDifference);
        System.out.println("The distance between the 2 points is : " + distance);
    }
}
