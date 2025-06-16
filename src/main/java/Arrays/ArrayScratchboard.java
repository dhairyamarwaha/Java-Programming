package Arrays;

import java.util.Scanner;

public class ArrayScratchboard {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] num2 = {1,2,3,4,5};
        //displayArrayContent(num2);

        initialiseArray(num);
        displayArrayContent(num);

        int addition = sum(num);
        System.out.println("The sum of all the elements is : " + addition);

    }
    private static void displayArrayContent(int[] num){
        for (int index = 0; index<num.length; index++){
            if (index == 0){
                System.out.print("[" + num[index] + ",");
            } else if (index == num.length - 1) {
                System.out.print(num[index] + "]");
            } else{
                System.out.print(num[index] + " ,");
            }

        }
    }
    private static void initialiseArray(int[] num){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < num.length; index++){
            num[index] = sc.nextInt();
        }
    }

    private static int sum(int[] array){
        int result = 0;
        for (int index = 0; index < array.length; index++){
            result = array[index] + result;
            // result += array[index];

        }
        return result;
    }
}