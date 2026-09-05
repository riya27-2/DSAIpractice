public class findidx{
    public static void findidxNum(int arr[],int key,int i){
      
        if(i == arr.length){
          return;
        }
        if(arr[i] == key){
            System.out.println(i);

            findidxNum(arr,key,i+1);
        }else{
           findidxNum(arr,key,i+1);

        }

         }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,4,3,2,3,2,1};
        int key =2;
        
        findidxNum(arr,key,0);
    }
}