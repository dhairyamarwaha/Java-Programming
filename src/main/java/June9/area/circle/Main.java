package June9.area.circle;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle();

        double area = circle.area(getRadius());
        System.out.println("The area of the circle is : " + area);
    }

    private static double getRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of the radius : ");
        double radius = sc.nextDouble();
        return radius;
    }
}
