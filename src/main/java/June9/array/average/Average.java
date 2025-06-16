package June9.array.average;

import java.util.Scanner;

public class Average {
    int size = -1;
    Scanner sc = new Scanner(System.in);
    int[] array;

    public void getSize(){
        System.out.print("Enter array size : ");
        size = sc.nextInt();
    }

    public void initializeArray(){
        if (size == -1){
            System.out.println("Please initialize the array");
        }
        array = new int[size];
        for (int index = 0; index < size; index++){
            System.out.print("Please enter the " + (index + 1) + " number : ");
            array[index] = sc.nextInt();
        }
    }

    public void displayArray(){
        if (size == -1){
            System.out.println("Please initialize the array");
        }

        for (int index = 0; index < size; index ++){
            if (size == 1){
                System.out.println("[" + array[index] + "]");
                break;
            }
            if (index == 0){
                System.out.print("[" + array[index] + ", ");
            } else if (index == size - 1) {
                System.out.print(array[index] + "]");
            } else{
                System.out.print(array[index] + ", ");
            }
        }
    }

    public double average() throws Exception{
        double sum = 0;

        for (int index = 0; index < size; index ++){
            sum += array[index];
        }
        if (sum > Integer.MAX_VALUE){
            throw new Exception("Range overflow");

        }

        return sum/size;
    }
}
