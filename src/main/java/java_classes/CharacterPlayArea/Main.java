package java_classes.CharacterPlayArea;

import java_classes.CharacterPlayArea.shape.Rectangle;

public class Main {
    public static  void main(String[] str){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.length=5;
        rectangle1.breadth=10;

        rectangle2.length=4;
        rectangle2.breadth=6;

        System.out.println("Area of reactange 1 is' " + rectangle1.area());
        System.out.println("Area of reactange 2 is: "+ rectangle2.area());
    }
}
