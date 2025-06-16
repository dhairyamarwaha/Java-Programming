package MyClasses.MyPrograms;

import java.util.Scanner;

public class HelloWorld {
    public void sayHello(){
        System.out.println("Hello World!");
    }

    public String getAName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        return sc.next();
    }

    public void greeting(String name){
        System.out.println("Hello " + name + ", welcome to the world of programming!");
    }
}
