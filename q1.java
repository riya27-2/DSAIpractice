import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();

            if(word.length() > 10){
            int len=word.length();
              char fs= word.charAt(0);
              int bs=len - 2;
              char ls=word.charAt(len-1);
              String f= "" + fs + bs +ls ;
              System.out.println(f);

            }else{
                System.out.println(word);
            }
        }
        

    }

