import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list1 = new ArrayList<>();

  // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9);
        System.out.println(list);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

    //get element
    Integer element= list.get(2);
   System.out.println(element);

   // DELETE element
   list.remove(2);  //2 is index here
   System.out.println(list);

   //set element
   list.set(2,27);
   System.out.println(list);

   // check if element exist in the array
   System.out.println(list.contains(21));
 System.out.println(list.contains(27));

 // find size of AL
System.out.print(list.size());

//print the arraylist

for(int i=0;i<list.size();i++){
    System.out.print(list.get(i));

  }
System.out.println();

//Reverse print

for(int i=list1.size()-1;i>=0;i--){
    System.out.print(list1.get(i));
}
System.out.println();

    }
 }
