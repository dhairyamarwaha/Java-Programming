package MyClasses.MyPrograms;

public class Main {
    public static void main(String[] args) {
        HelloWorld object = new HelloWorld();
        object.sayHello();

        String name = object.getAName();
        object.greeting(name);

        StringUtils object2 = new StringUtils();
        displayReverseString(object2.reverseString(name));
    }

    public static void displayReverseString(String reverseString){
        System.out.println("The reverse of your name is : " + reverseString);
    }
}
