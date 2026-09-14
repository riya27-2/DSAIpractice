import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        
        int n1=array.get(2);
        int n2=array.get(0);
        array.set(0,n1);//idx , which element to swap
        array.set(2,n2);

             System.out.println(array);

        }

    }

