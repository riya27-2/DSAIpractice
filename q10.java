import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            if(n>=5){
                n=n-5;
                count++;
            }else{
               n=0;
               count++;
            }
        }
        System.out.println(count);
    }
}
