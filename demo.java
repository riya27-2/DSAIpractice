import java.util.*;

class demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int num =sc.nextInt();
        // if(num%2==0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("not even it is odd");
        // }
int button=sc.nextInt();
  switch(button){
    case 1:System.out.println("hello");
    break;
    case 2:System.out.println("namaste");
    break;
    case 3:System.out.println("welcome");
    break;
    default:System.out.println("please enter valid button");
  }
        
    }
}
