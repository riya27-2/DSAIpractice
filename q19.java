import java.util.*;
public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String num=Integer.toString(n);
        String k1=Integer.toString(k);

        for(int i=0;i<num.length();i++){
          if(num.charAt(i) == k1.charAt(i)){
            System.out.print("0");
          }else{
            System.out.print("1");
          }
        }
        
    }
}
