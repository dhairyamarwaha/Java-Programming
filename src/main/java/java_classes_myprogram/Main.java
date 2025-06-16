package java_classes_myprogram;

public class Main {
    public static void main(String[] args) {
        HelloWorld object = new HelloWorld();
        object.sayHello();


        String name = object.getAName();
        object.greet(name);
    }
}
