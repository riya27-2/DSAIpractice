import java.util.*;

public class q2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int attempt=sc.nextInt();
       int count=0;
       for(int i=0;i< attempt;i++){
        
         int f1=sc.nextInt();
         int f2=sc.nextInt();
         int f3=sc.nextInt();
       
         int sum=f1+f2+f3;
        if(sum>=2 ){
        count++;
     }
     
     }
     System.out.println(count);


 }
      
    }

