import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String newstr="";

        int count=0;
        for(int i=0;i<sentence.length();i++){
            
            char ch=sentence.charAt(i);
           // if(sentence.charAt(i) != newstr) {

                 count++;
            System.out.println(count);
            }
      }
      if(count % 2 == 0){
        System.out.println("Ignore HIM!");
      }else{
        System.out.println("CHAT WITH HER!");
      }


    }


