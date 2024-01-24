package ArraysPractice;

import java.util.Arrays;

//1 Two Sum
public class twoSum {
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 26;
        int[] output = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        } System.out.println(Arrays.toString(output));
    }
}

