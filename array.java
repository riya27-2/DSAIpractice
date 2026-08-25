import java.util.*;

public class array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int array[][]=new int[row][col];
   
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
System.out.println("search num");
int number=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]==number){
                    System.out.println("occured at index"+i+" "+j);
                }
            }
        }
    }
}
//     int array[]=new int[5];
//     Scanner sc=new Scanner(System.in);

//     for(int i=0;i<5;i++){
//         array[i]=sc.nextInt();

//     }
//     System.out.println("search number");
//     int num=sc.nextInt();

//     // for(int i=0;i<5;i++){
//     // System.out.println(array[i]);
//     // }
//     for(int i=0;i<=5;i++){
//         if(num==array[i]){
//             System.out.println("at index:"+i);
//         }
//     }
//     }
// }
