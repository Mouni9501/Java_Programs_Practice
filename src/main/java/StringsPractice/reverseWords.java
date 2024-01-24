package StringsPractice;

import java.util.Arrays;

//557 Reverse words in String
public class reverseWords {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        String[] str = s.split(" ");
        String finalString = " ";
        for(int i =0;i<str.length-1;i++){
            char[] ch = str[i].toCharArray();
            String rev = " ";
            for(int j=ch.length-1;i>=0;i--){
                rev = str[i].charAt(j)+rev;
            }
            finalString+= rev;

        }
        System.out.println(finalString.trim());

    }
}
