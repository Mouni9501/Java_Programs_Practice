package ArraysPractice;
//2798 num of employees who met the target

public class numberOfEmployeesWhoMetTarget
{
    public static void main(String[] args)
    {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        int count =0;
        for(int i=0;i<=hours.length-1;i++)
        {
            if(hours[i]>=target)
            {
                  count = count+1;
            }
        }System.out.println("Total no: of employees who achieved the target is: "+count);

    }
}
