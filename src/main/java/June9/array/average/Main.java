package June9.array.average;

public class Main {
    public static void main(String[] args) throws Exception {
        Average average = new Average();

        average.getSize();
        average.initializeArray();
        average.displayArray();
        double avg = average.average();
        System.out.println("\nThe average of the entered numbers is : " + avg);
    }
}
