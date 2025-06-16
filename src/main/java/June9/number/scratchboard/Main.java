package June9.number.scratchboard;

public class Main {
    public static void main(String[] args) {
        NumberScratchboard numberscratchboard = new NumberScratchboard();

        int number = numberscratchboard.getNumber();
        int factorial = numberscratchboard.factorial(number);
        System.out.println("The factorial of the entered number is : " + factorial);
        System.out.println("Dhairya is testing github code");
    }
}
