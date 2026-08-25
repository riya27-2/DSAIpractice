import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char ch = str.charAt(0);
        char ch1= Character.toUpperCase(ch);
        String sb=str.substring(1,str.length());
        String finalStr=ch1+sb;

        System.out.println(finalStr);

    }
}
