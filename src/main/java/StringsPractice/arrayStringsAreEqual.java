package StringsPractice;
//1662 Check if two string arrays are equivalent
public class arrayStringsAreEqual
{
    public static void main(String args[])
    {
        String[] word1 ={"ab", "c"};
        String[] word2 ={"a", "bc"};
        String afterConcatenating1 = null;
        String afterConcatenating2 = null;
        String finalWord1 = word1[0];
        String finalWord2 = word2[0];
        if(word1.length>1){
            for(int i=1;i<word1.length;i++) {
                afterConcatenating1 = finalWord1.concat(word1[i]);
                finalWord1 =  afterConcatenating1;
            }
        }
        if(word2.length>1) {
            for (int i = 1; i <word2.length ; i++) {
                afterConcatenating2 = finalWord2.concat(word2[i]);
                finalWord2 = afterConcatenating2;
            }
        }
        if(finalWord1.equals(finalWord2))
        {
            System.out.println("Both Strings got matched");
        }
        else {
            System.out.println("Both Strings didn't match");
        }
    }
}
