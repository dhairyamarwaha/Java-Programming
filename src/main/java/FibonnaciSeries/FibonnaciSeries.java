package FibonnaciSeries;

import java.util.Scanner;

public class FibonnaciSeries {
    Scanner sc = new Scanner(System.in);
    int terms;
    int firstTerm = 0;
    int secondTerm = 1;

    public void getTerms(){
        System.out.print("Please enter the number of terms you wish to go till : ");
        terms = sc.nextInt();
    }

    public void printSeries(){
        for (int index = 1; index <= terms; index++){
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
