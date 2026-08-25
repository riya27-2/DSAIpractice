// public class pattern {
//     public static void main(String[] args) {
// int n=4;
//   for(int i=1;i<=n;i++){

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//      for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
// System.out.println();
//   }

//   for(int i=n;i>=1;i--){

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//      for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
// System.out.println();
//   }



//   for(int i=1;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         if((i+j)%2==0){
//             System.out.print("1");
//         }else{
//             System.out.print("0");
//         }
//     }
//     System.out.println();
//   }




//   int n=1;
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(n);
//             n++;
//         }
        
//         System.out.println();
//     }

//   for(int i=1;i<=5;i++){
//     for(int j=1;j<=(5-i)+1;j++){
//         System.out.print(j+" ");
//     }
//     System.out.println(" ");
//   }


        
//         int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


        // for(int i=1;i<=5;i++) {
        //     for(int j=1;j<=(5-i)+1;j++){
        //        System.out.print("*");
        //     }
        //     System.out.println();
        // }







public class pattern {
    public static void main(String[] args) {    
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
