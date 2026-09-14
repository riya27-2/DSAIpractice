import java.util.ArrayList;

public class findmax {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(10);
        array.add(7);
        array.add(79);
        array.add(20);
        array.add(33);
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.size();i++){
            if(max<array.get(i)){
                max=array.get(i);
            }
        }
        System.out.println(max);
        }
}
