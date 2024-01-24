package ArraysPractice;
// 2824 count Pairs Whose Sum Is Less Than Target
public class countPairsWhoseSumIsLessThanTarget
{
    public static void main(String[] args)
    {
        int[] nums ={-6,2,5,-2,-7,-1,3};
        int target = -2;
        int count =0;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum<target){
                    count = count+1;
                }
            }
        }System.out.println("Total no:of pairs whose count is less than target is: "+count);
    }
}
