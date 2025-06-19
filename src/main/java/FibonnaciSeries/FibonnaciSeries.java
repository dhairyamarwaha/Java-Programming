package FibonnaciSeries;

import java.util.Scanner;

public class FibonnaciSeries {
    int firstTerm = 0;
    int secondTerm = 1;



    public void printSeries(int terms){
        for (int index = 1; index <= terms; index++){
            if (index == terms){
                System.out.println(firstTerm);
            } else {
                System.out.print(firstTerm + ", ");
            }

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}