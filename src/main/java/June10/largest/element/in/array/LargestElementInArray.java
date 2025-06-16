package June10.largest.element.in.array;

import java.util.Scanner;

public class LargestElementInArray {

    Scanner sc = new Scanner(System.in);
    int arraySize;
    int[] array;
    int largestElement;
    
    public void getSize(){
        System.out.print("Please enter the size of the array : ");
        arraySize = sc.nextInt();
        array = new int[arraySize];
    }
    
    public void defineArray(){
        for (int index = 0; index < arraySize; index++){

            System.out.print("Please enter the " + (index + 1) + " number : ");
            array[index] = sc.nextInt();
        }
        
        for (int index = 0; index <= arraySize - 1; index ++){
            if (index == 0){
                System.out.print("[" + array[index] + ", ");
            } else if (index == arraySize - 1) {
                System.out.print(array[index] + "]\n");
            } else{
                System.out.print(array[index] + ", ");
            }
        }
    }

    public int largestElement(){
        for (int index = 0; index < arraySize; index++){
            if (array[index] > largestElement){
                largestElement = array[index];
            }
        }

        return largestElement;
    }
    
}
