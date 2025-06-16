package java_classes_myprogram;

import java.util.Scanner;

public class HelloWorld {
    public void sayHello(){
        System.out.println("Hello world, Dhairya is coming!");
    }

    public String getAName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a name : ");
        return sc.next();
    }

    public void greet(String name){
        System.out.println("Hello " + name + ", welcome to the world of programming!");
    }
}
