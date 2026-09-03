public class firstOccur {

    public static int  firstOccurence(int arr[],int key,int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length){
            return -1;
        }
        return firstOccurence(arr ,key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,7,33};
        int key=7;
        int i=0;
        System.out.println(firstOccurence(arr,key,i));
    }
}
