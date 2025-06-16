package June9.mulitplication.table;

import java.util.Scanner;

public class MulitplicationTable {
    Scanner sc = new Scanner(System.in);

    public void getNumber(){
        System.out.print("Please enter the number whose table you wish to calculate : ");
        int number = sc.nextInt();

        System.out.print("Please enter till which number you wish to print the table to : ");
        int endNumber = sc.nextInt();
    }

    public void printTable(int number, int endNumber){
        for (int index = 1; index <= endNumber; index++){
            System.out.println(number + "x" + index + "=" + (number*index));
        }
    }
}
