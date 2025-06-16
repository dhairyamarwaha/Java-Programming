package June10;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = new int[5];

        inputForArray(array);

        int largestValue = largestElement(array);
        System.out.println("The largest element in the array is : " + largestValue);
    }

    private static void inputForArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < array.length; index++){
            array[index] = sc.nextInt();
        }
    }

    private static int largestElement(int[] array){
        int largestValue = 0;
        for (int index = 0; index < array.length; index ++){
            if(array[index] > largestValue){
                largestValue = array[index];
            }
        }
        return largestValue;
    }
}
