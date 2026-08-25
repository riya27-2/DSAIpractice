import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String one=sc.next();
        String two=sc.next();

        one=one.toLowerCase();
        two=two.toLowerCase();

       if(one.compareTo(two) < 0){
        System.out.println(-1);
       }else if(one.compareTo(two) > 0){
        System.out.println(1);
       }else{
        System.out.println(0);
       }
    }
    }

