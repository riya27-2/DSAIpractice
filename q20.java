import java.util.*;

public class q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();

           if( a + b == c || b+c== a || c+a == b){
            System.out.println("yes");

           }else{
            System.out.println("no");
           }
        }
        
    }
}
