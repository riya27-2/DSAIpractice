public class Tilling{
    public static int Tiling(int n){
        if(n== 0 || n==1){
            return 1;
        }
        //vertical tiles
        int vertical=Tiling(n-1);
        //horizontal tiles
        int horizontal=Tiling(n-2);
        
        int totalways=vertical+horizontal;

        return totalways;
    }
    public static void main(String[] args) {

        System.out.println(Tiling(4));
    }
}