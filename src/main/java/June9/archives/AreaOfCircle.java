package June9.archives;

import java.util.Scanner;


public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle : ");
        int radius = sc.nextInt();
        double area = areaOfCircle(radius);
        System.out.println("The area of the circle is : " + area);

    }
    private static double areaOfCircle(int radius){

        return (double) (Math.PI * radius * radius);
    }
}


