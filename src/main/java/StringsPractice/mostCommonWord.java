package StringsPractice;

import java.util.ArrayList;

public class mostCommonWord {
    public static void main(String args[]){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String[] sp = paragraph.split(" ");
        int count =0;
        int max =0;
        for(int i =0;i<sp.length;i++){
            for(int j=i+1;j<sp.length-1;j++){
                if(sp[i].equals(banned)) {
                    break;
                }
                else if(sp[i].equalsIgnoreCase(sp[j])){
                    count = count+1;
                }
                 max = count;

            }
        }
    }
}
