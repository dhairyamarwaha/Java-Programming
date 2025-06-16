package java_classes.CharacterPlayArea;

import java.util.Scanner;

class CharacterOperation{
    public   void displayCharacterAndASCIIValue(String str) {
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " = " + getASCIIValue(str.charAt(i)));
        }
    }

    public   String getAStringFromKeybaord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string : ");
        String str = sc.next();
        return str;
    }
    private  int getASCIIValue(char ch){
        return Integer.valueOf(ch);
    }

    public   char findLargestCharacter(String str){
        char largestCharacter = str.charAt(0);
        for (int i = 1; i<str.length(); i++){
            if (str.charAt(i) > largestCharacter){
                largestCharacter = str.charAt(i);
            }
        }
        return largestCharacter;
    }
}
public class CharacterScratchboard {
    public static void main(String[] args) {
        String  str = "yes";
        String exitCondition = "-1";
        CharacterOperation operation = new CharacterOperation();

        System.out.println("Type \"-1\" to exit");

        do{
            str = operation.getAStringFromKeybaord();
            char ch = operation.findLargestCharacter(str);
            System.out.println("Largest character in the entered string is : " + ch);
             if (str.toLowerCase().equals(exitCondition)){
                 break;
             }
            operation.displayCharacterAndASCIIValue(str);
        }while (!str.toLowerCase().equals(exitCondition));

    }


}
