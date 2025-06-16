package string.scratchboard;

import java.util.Scanner;

public class characterScratchboard {
    public static void main(String[] args) {
        String  str = "yes";
        String exitCondition = "-1";
        System.out.println("Type \"-1\" to exit");
//        while(true) {
//             str = getAStringFromKeybaord();
//             if (str.toLowerCase().equals("no")){
//                 break;
//             }
//            displayCharacterAndASCIIValue(str);
//        }
        do{
            str = getAStringFromKeybaord();
            char ch = findLargestCharacter(str);
            System.out.println("Largest character in the entered string is : " + ch);
             if (str.toLowerCase().equals(exitCondition)){
                 break;
             }
            displayCharacterAndASCIIValue(str);
        }while (!str.toLowerCase().equals(exitCondition));

    }

    private static void displayCharacterAndASCIIValue(String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " = " + getASCIIValue(str.charAt(i)));
        }
    }

    private static String getAStringFromKeybaord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String str = sc.next();
        return str;
    }
    private static int getASCIIValue(char ch){
        return Integer.valueOf(ch);
    }

    private static char findLargestCharacter(String str){
        char largestCharacter = str.charAt(0);
        for (int i = 1; i<str.length(); i++){
            if (str.charAt(i) > largestCharacter){
                largestCharacter = str.charAt(i);
            }
        }
        return largestCharacter;
    }
}
