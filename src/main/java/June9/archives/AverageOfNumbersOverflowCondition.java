package June9.archives;

public class AverageOfNumbersOverflowCondition {
    public static void main(String[] args) {
        int x = 2_147_483_647;
        long result = (long) x+1;
        if (result > Integer.MAX_VALUE){
            System.out.println("Range overflow");
        } else{
            System.out.println(result);
        }
//        System.out.println(result);
//        System.out.println(x+1);

        System.out.println(18+6/3*2);
    }
}