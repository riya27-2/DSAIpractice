package Array;
public class linear{
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,88,29,6,89,27,21,01};
        int key=21;
      int idx=linear(num,key);
        if(idx == -1){
            System.out.println("sorry");
        }else{
            System.out.println("index:"+ idx);
        }
    }
}