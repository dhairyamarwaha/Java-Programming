package June12;

import java.util.Scanner;

public class OddNumbersInArray {
    public static void main(String[] args) throws Exception {
      //  int arraySize = sizeOfArray();

//        int[] givenArray = getArrayElements(arraySize);
//        displayArray(givenArray);
//
//       // System.out.println("All elements are odd ? " + allElementsOdd(givenArray));
//        System.out.println("The largest element in the array is : " + largest(givenArray));
//        System.out.println("The smallest element in the array is : " + smallest(givenArray));
//        System.out.println("The sum of all the elements in the array is : " + sumOfAllElements(givenArray));
        int number = 12321;
        int reverseNumber = reverseANumber(number);
        System.out.println("The reversed number is : " + reverseNumber);

        System.out.println("This number is pallindrome " + (number == reverseNumber));

    }
    private static void displayArray(int[] array){
        for (int index = 0; index < array.length; index++) {

            if (index == 0) {
                System.out.print("\n[" + array[index] + ", ");
            } else if (index == array.length - 1) {
                System.out.print(array[index] + "]\n");
            } else{
                System.out.print(array[index] + ", ");
            }
        }
    }

    private static int sizeOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the array : ");
        return  sc.nextInt();
    }

    private static int[] getArrayElements(int arraySize){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[arraySize];
        for (int index = 0; index < arraySize; index ++){
            System.out.print("Please enter the " + (index + 1) + " element : ");
            nums[index] = sc.nextInt();
        } return nums;
    }

    private static Boolean allElementsOdd(int[] array){
        for (int index = 0; index < array.length; index++){
            if (array[index] % 2 == 0){
                return false;
            }
        }
        return true;
    }

    private static int largest  (int[] givenArray) throws Exception {
        if (givenArray == null){
            throw new Exception("Null array is not accepted");


        }
        int largestElement = givenArray[0];
        for (int index = 1; index < givenArray.length; index++){
            if (givenArray[index] > largestElement){
                largestElement = givenArray[index];
            }
        }
        return largestElement;
    }

    private static int smallest(int[] givenArray) throws Exception {
        if (givenArray == null){
            throw new Exception("Null array is not accepted");


        }
        int smallestElement = givenArray[0];
        for (int index = 1; index < givenArray.length; index++) {
            if (givenArray[index] < smallestElement) {
                smallestElement = givenArray[index];
            }
        }
        return smallestElement;
    }

    private static int sumOfAllElements(int[] array)throws Exception {
        if (array == null){
            throw new Exception("Null array is not accepted");


        }
        int sum = 0;
        for (int index = 0; index < array.length; index++){
            sum += array[index];
        }
        return sum;
    }

    private static int reverseANumber(int number){
        int result = 0;
        int remainder = 0;
        while (number !=0){
            remainder = number % 10;
            number /= 10;
            result = result * 10 + remainder;
        }

        return result;
    }

}
