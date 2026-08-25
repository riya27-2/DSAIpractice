import java.util.*;

public class q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int count=0;
        for(int i=0;i<4;i++){
          int  h=sc.nextInt();
          String need=Integer.toString(h);
          
         char ch=need.charAt(i);

        // int count=0;
        if(need.contains(String.valueOf(ch))){
            count++;
        }

        }
        System.out.println(count);
        
    }
}
