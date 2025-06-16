package June9.number.scratchboard;

import java.util.Scanner;

public class NumberScratchboard {
    Scanner sc = new Scanner(System.in);


    public int getNumber(){
        System.out.print("Please enter a number : ");
        int number = sc.nextInt();
        return number;
    }


    public int factorial(int number){
        int factorialValue = 1;
        for (int index = 1; index <= number; index++){
            factorialValue *= index;
        }

        return factorialValue;
    }
}
