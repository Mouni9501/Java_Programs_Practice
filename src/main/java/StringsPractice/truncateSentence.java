package StringsPractice;

//1816 Turncate Sentence
public class truncateSentence {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 5;
        String[]  str = s.split(" ");
        String finalString ="";
        for(int i=0;i<=k-1;i++){
        finalString = finalString+str[i].concat(" ");
        }
        System.out.println(finalString.trim());
        }

    }





