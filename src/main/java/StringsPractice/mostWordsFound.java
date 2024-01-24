package StringsPractice;
//2114 maximum number of words found in sentences
public class mostWordsFound
{
    public static void main(String[] args)
    {
        int le = 0;
        int longestStringLength =0;
        String[] words ={"w jrpihe zsyqn l dxchifbxlasaehj",
                "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
                "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
                "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
                "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
                "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
                "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk",
                "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"};
        for(int i =0;i<=words.length-1;i++)
        {
            String[] afterSplitting = words[i].split(" ");
            int  length = afterSplitting.length;
            if(length>longestStringLength)
            {
                longestStringLength = length;
            }
        }

        System.out.println("Length of the longest String is: "+longestStringLength);
    }
}
