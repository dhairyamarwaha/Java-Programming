package June10;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many elements you wish to enter in the array : ");
        int numberOfElements = sc.nextInt();

        int[] array = new int[numberOfElements];

        inputForArray(array);
        int largestElement = LargestElementV2(array);
        System.out.println("The second largest element is : " + largestElement);

    }

    private static void inputForArray(int[] array) {
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < array.length; index ++){
            array[index] = sc.nextInt();
        }
    }

    private static int LargestElement(int [] array){
        int LargestElement = 0;
        int secondLargestElement = 0;
        for (int index = 0; index < array.length; index++){
            if (LargestElement < array[index]){
                LargestElement = array[index];
            }
        } return LargestElement;
    }

    private static int LargestElementV2(int [] array){
        int largestElement = 0;
        int secondLargestElement = 0;
        int currentElement = 0;

        for (int index = 0; index < array.length; index++){
            currentElement = array[index];
            if (currentElement > largestElement){
                secondLargestElement = largestElement;
                largestElement = currentElement;
            } else if (currentElement > secondLargestElement) {
                secondLargestElement = currentElement;
            }
        }
        return secondLargestElement;
    }

}
