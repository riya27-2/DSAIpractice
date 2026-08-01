public class subArray {


  public static int subArraySum(int nums[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<nums.length;i++){
        int start=i;
        for(int j=i; j<nums.length ;j++){
            int end=j;
            currSum=0;

            for(int k=start;k<=end; k++){
                currSum += nums[k];

            }
            System.out.println(currSum);
            if (maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    return maxSum;
  }
    
    public static void main(String args[]){
        int nums[]={2,3,5,2,5};
      int res=subArraySum(nums);
      System.out.println("max sum is"+ res);
    }
}
