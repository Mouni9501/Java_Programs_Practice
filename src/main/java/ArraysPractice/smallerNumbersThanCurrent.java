package ArraysPractice;

import java.util.Arrays;
//check if two string arrays are equivalent
public class smallerNumbersThanCurrent {
    public static void main(String args[])
    {
        int[] nums = {8,1,2,2,3};

        int[] ouput = new int[nums.length];
        for(int i =0;i<nums.length-1;i++){
            int count =0;
            for(int j=i+1;j<nums.length;j++){
                if(j>=nums.length/2)
                {

                }
                if(nums[i]>=nums[j]) {
                    count = count + 1;
                }
            }
            ouput[i] = count;
        }
      System.out.println(Arrays.toString(ouput));
    }
}
