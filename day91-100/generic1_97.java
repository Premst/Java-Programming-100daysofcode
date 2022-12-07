
// day-97 100daysofcodechallenge
// Java Generics
// 1. Bugs can be detected at compile-time:
import java.util.ArrayList;
public class generic1_97 {
    public static void main(String[] args) {
        // Without Java Generics

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10); // Integer value 
        myArrayList.add("Prem kumar"); // String value
        myArrayList.add(20.4); // Double value
        System.out.println(myArrayList);
        
        //  int x = myArrayList.get(0);     // error
        //  System.out.println(x);       
        
        int x = (int) myArrayList.get(0); 
        System.out.println(x);

        // With Java Generics:
        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        myArrayList1.add(10); // Integer value
        // myArrayList1.add("Prem Kumar"); // String value
        // myArrayList1.add(20.4); // Double value
        System.out.println(myArrayList);
    }
}
