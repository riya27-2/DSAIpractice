import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=sc.next();
      
        int count=0;
        for(int i=1;i<n;i++){
          if(res.charAt(i) == res.charAt(i-1)){
          
            count++;
          }
        }
         System.out.println(count);
            
        }
        
        }

    


