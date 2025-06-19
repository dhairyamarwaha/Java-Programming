package FibonnaciSeries;

import java.util.Scanner;

public class GetNumbers {
    Scanner sc = new Scanner(System.in);
    public int inputNumbers(){
        System.out.print("How many numbers of the series do you wish to print? : ");
        return sc.nextInt();
    }
}
