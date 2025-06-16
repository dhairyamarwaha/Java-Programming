package June10.largest.element.in.array;

public class Main {
    public static void main(String[] args) {
        LargestElementInArray largestElement = new LargestElementInArray();

        largestElement.getSize();
        largestElement.defineArray();

        int maximum = largestElement.largestElement();
        System.out.println("The largest element of the array is : " + maximum);
    }
}
