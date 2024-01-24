package StringsPractice;

import java.util.ArrayList;
import java.util.Arrays;

//2942 Find words containing character
public class findWordsContainingCharacter
{
    public static void main(String[] args)
    {
        String[] words = {"leet","code","program","sample"};
        char ch = 'e';
        int k=0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] ar = new int[words.length];
        for(int i=0;i<=words.length-1;i++) {
            char[] chr = words[i].toCharArray();
            for(int j=0;j<=chr.length-1;j++) {
                if(chr[j]==ch) {
                    int index ;
                    index = i;
                    al.add(index);
//                    ar[k] = index;
//                    k++;
                    break;
                }

            }
        }

        for(Integer indexes :al){
            System.out.println("This character is found at these indexes: "+indexes);
        }
//        System.out.println("This character is found at these indexes: "+Arrays.toString(ar));


    }
}
