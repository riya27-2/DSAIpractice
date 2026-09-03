public class power {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        int result=x*pow(x,n-1);
        return result;

    }
   public static void main(String[] args) {
   
    System.out.println(pow(2,10));
   } 
}
