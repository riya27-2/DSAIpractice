public class pattern2 {

    public static void p2(int row,int cols){
         for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                 
                 System.out.print(" ");//spaces
            }
            for(int k=1;k<=i;k++){
                 
                 System.out.print("*");//star
            }
            
         
         System.out.println();
        }
    }
    public static void main(String args[]){
        p2(4,4);
    }
}
