package June10;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int arraySize = getArraySize();
        int[] array = new int[arraySize];

        inputForArray(array);

        int[] newArray = reverse(array);
        displayArrayContent(array);
        displayArrayContent(newArray);
    }

    private static void inputForArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int index = 0; index < array.length; index ++){
            array[index] = sc.nextInt();
        }
    }

    private static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int counter = 0;
        for (int index = array.length - 1; index >=0; index--){
            result[counter] = array[index];
            counter++;
        }
        return result;
    }

    private static void displayArrayContent(int[] num){
        for (int index = 0; index<num.length; index++){
            if (index == 0){
                System.out.print("\n[" + num[index] + ", ");
            } else if (index == num.length - 1) {
                System.out.print(num[index] + "]");
            } else{
                System.out.print(num[index] + ", ");
            }

        }
    }

    private static int getArraySize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        return sc.nextInt();

    }
}
