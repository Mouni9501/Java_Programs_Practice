package StringsPractice;

import java.util.Arrays;

public class SplitExample
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

    }
}
