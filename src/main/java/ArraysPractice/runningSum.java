package ArraysPractice;

import java.util.Arrays;

//1480 running sum of 1D array
public class runningSum {
    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        int sum =0;
        for(int i=0;i<=nums.length-1;i++){
            sum = sum+nums[i];
            nums[i] =sum;
        }
        System.out.println(Arrays.toString(nums));


    }
}
