package June12;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class ReversingAString{
    public static void main(String[] args) {
        String inputString = getString();
        reversingAString(inputString);


        System.out.println("The reversed string is : " + reversingAString(inputString));
    }

    private static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the string you with to reverse :");
        return sc.next();
    }

    private static String reversingAString(String inputString){
        String reversedString = "";
        for (int index = inputString.length() - 1; index >=0; index--){
            reversedString += inputString.charAt(index);
        } return reversedString;
    }
}

