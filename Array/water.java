package Array;

public class water {
    public static int waterTrap(int height[]){
        int currSum=0;
        for(int i=0;i<height.length;i++){
        

            int right=height[i];
            for(int j=i+1; j<height.length ; j++){
          right=Math.max(right , height[j]);
          
            }

           int left=height[i];
            for(int k=i-1; k>=0 ; k--){
            left=Math.max(left , height[k]);

            }
            int min=Math.min(left , right);
            int trap=min-height[i];
            currSum=currSum+trap;
        }
        return currSum;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int waterTrapping=waterTrap(height);
        System.out.println(waterTrapping);
    }
}
