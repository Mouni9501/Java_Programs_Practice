package StringsPractice;

import java.util.ArrayList;
public class ReversingAStringWithoutChangingFullStopIndex {
    public static void main(String[] args) {
        String str = "hello.hi"; // iholl.eh
        char[] ch = str.toCharArray();
        char[] op = new char[ch.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i <= ch.length - 1; i++) {
            if (ch[i] == '.') {
                al.add(i);
            }
        }
        int k = 0;
        for(int j=ch.length-1;j>=0;j--){
        if(al.get(k)==j){
         op[j] = '.';
         k++;
         }
         else {
             op[op.length-2-j] = ch[j];
               }
            }
        System.out.print(op);
    }
}



