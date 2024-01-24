package ArraysPractice;

import java.util.Arrays;

//1470 Shuffle the array
public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = new int[nums.length];
        int k = 0, s = 1;
        for (int i = 0; i < n; i++) {
            output[k] = nums[i];
            output[s] = nums[i + n];
            k += 2;
            s += 2;
        }
        System.out.println(Arrays.toString(output));
    }
}
