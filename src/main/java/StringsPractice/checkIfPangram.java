package StringsPractice;
//1832 Check if the sentece is a pangram
public class checkIfPangram {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int count =0;
        if(sentence.length()>=26){
         for(int i=0;i<sentence.length();i++){
             if(Integer.valueOf(sentence.charAt(i))>=97&&Integer.valueOf(sentence.charAt(i))<=122){
                count++;
             }
         }
        }
        if(count==26){
            System.out.println("Given String is a pangram");
        }
        else{
            System.out.println("Given String is not a pangram");
        }
    }
}
