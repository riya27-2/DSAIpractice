import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    boolean isfound=false;

        for(int i=0;i<n;i++){
             int ans=sc.nextInt();
             
             if(ans != 0){
                isfound=true;
                
             }
        }
        if(isfound){
            System.out.println("Hard");
        }else{
            System.out.println("Easy");
        }
          
    }
}
