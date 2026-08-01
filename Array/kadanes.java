public class kadanes {

    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;//minus infinity

        for(int i=0;i<arr.length;i++){
            cs=cs + arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs , ms);
        }

System.out.println(ms);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,5,6,-1,4};
        kadanes(arr);
    }
}
