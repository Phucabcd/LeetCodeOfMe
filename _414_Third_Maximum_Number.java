import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer num : nums) {
            System.out.println("Current num: " + num); // debug
            if (num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
                System.out.println("Updated first: " + first + ", second: " + second + ", third: " + third); // debug
            }

            else if (second == null || num > second) {
                third = second;
                second = num;
                System.out.println("Updated second: " + second + ", third: " + third);
            }

            else if (third == null || num > third) {
                third = num;
                System.out.println("Updated third: " + third);
            }

        }
        System.out.println("Final values - first: " + first + ", second: " + second + ", third: " + third);
        return third == null ? first : third;
    }

    public static void main(String[] args) {
        _414_Third_Maximum_Number solution = new _414_Third_Maximum_Number();
        int[] nums = { 2, 2, 3, 1 };
        System.out.println("Result: " + solution.thirdMax(nums));
    }
}