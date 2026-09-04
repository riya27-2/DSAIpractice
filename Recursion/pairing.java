public class pairing {

    public static int calcPair(int n){
        if(n == 1 || n== 2){
            return n;
        }
       int fn=calcPair(n-1);
       int fn1=calcPair(n-2);
       int total=fn1*(n-1);
        return fn+total;
    }
    public static void main(String[] args) {
        System.out.println(calcPair(3));
    }
}
