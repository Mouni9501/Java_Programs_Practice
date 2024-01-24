package ArraysPractice;

import java.util.Arrays;

/*
1929 ConcatenationOfArray
Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 */
public class ConcatenationOfArray
{
    public static void main(String[] args)
    {
        int[] input = {1,9,3,2,1};
        int[] output = new int[2*input.length];
        for(int i=0;i<=output.length-1;i++)
        {
            if(i>=input.length)
            {
                output[i] = input[i-input.length];
            }
            else {
                output[i] = input[i];
            }

        }System.out.print(Arrays.toString(output));
    }
}
