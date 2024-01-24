package ArraysPractice;

public class numIdenticalPairs
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        int count = 0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1; j<=arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    count = count+1;
                }
            }
        }System.out.println("Total number of identical pairs are: "+count);
    }
}
