import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
  // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9);
        System.out.println(list);

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
    }
 }
