package June9.archives;

public class AverageOfNumbersV2 {
    public static void main(String[] args) {
        int[] nums = {5,8,7,3,1};
        System.out.println("Average of numbers is: " +average(nums));
    }

    private static double average(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
        }
        return (double)sum / nums.length;
    }
}