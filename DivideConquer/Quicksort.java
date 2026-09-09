public class Quicksort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
     }
    public static void Quick(int arr[],int si, int ei){

        if(si>= ei){
            return;
        }
        int pidx=Partition(arr,si,ei);
        Quick(arr,si,pidx-1);
        Quick(arr,pidx+1,ei);
    }
    public static int Partition(int arr[], int si ,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for smaller ele than pivot

        for(int j=si;j<ei ; j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
                i++;
                //swap
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;


    }
     public static void main(String[] args) {
        int arr[]={7,5,0,3,6,1};
        Quick(arr,0,arr.length-1);
        printArr(arr);
     }
}
