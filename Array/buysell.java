import java.util.*;


public class buysell{

    public static int BuyAndSellStock(int sp[]){

        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i< sp.length ;i++){
            if(buyprice< sp[i]){
                int profit=sp[i]- buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyprice=sp[i];
            }
        }
        return maxprofit;
    }
public static void main (String args[]){
   int sp[]={7,1,5,3,6};
   System.out.println(BuyAndSellStock(sp));
}
}