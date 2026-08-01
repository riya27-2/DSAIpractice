package Array;
public class binary {
    public static int binarySearch(int numbers[], int key){
        int start=0,end=numbers.length-1;
       
        while(start<=end){

        int mid=(start+end)/2;

        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;
}
    public static void main(String args[]){
        int numbers[]={1,4,7,8,10,33,44,64,69,90,95,98};
        int key=90;
    
        System.out.println("founde at:"+ binarySearch(numbers,key));
    }
}
