package FibonnaciSeries;

import java.util.Scanner;

public class GetNumbers {
    Scanner sc = new Scanner(System.in);
    public void inputNumbers(){
        System.out.print("How many numbers of the series do you wish to print? : ");
        int inputNumbers = sc.nextInt();
    }
}
