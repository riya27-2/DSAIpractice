public class lastOccur {
    public static int  lastOccurence(int arr[],int key,int i){
         if(i == arr.length){
            return -1;
        }

        int isFound=lastOccurence(arr,key,i+1);

        if(arr[i] == key && isFound == -1){
            return i;
        }
       
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,1,33,9,0,1,6,5};
        int key=1;
        int i=0;
        System.out.println(lastOccurence(arr,key,i));
    }
}
