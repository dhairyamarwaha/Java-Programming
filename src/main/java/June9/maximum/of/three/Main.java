package June9.maximum.of.three;

public class Main {
    public static void main(String[] args) {
        MaximumOfThree max = new MaximumOfThree();

        max.getNumbers();

        int greatest = max.comparison();
        System.out.println("The largest number is : " + greatest);
    }
}
