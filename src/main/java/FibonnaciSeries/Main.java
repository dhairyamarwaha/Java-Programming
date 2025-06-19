package FibonnaciSeries;

public class Main {
    public static void main(String[] args) {
        FibonnaciSeries series = new FibonnaciSeries();
        GetNumbers inputNumbers = new GetNumbers();
        int numbers = inputNumbers.inputNumbers();

        series.printSeries(numbers);
    }
}