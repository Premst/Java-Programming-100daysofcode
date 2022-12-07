// #91
// day-83 100daysofcodechallenge
// ArrayList in Java : Demo and Methods S

import java.util.ArrayList;
public class arrayList_83 {
    public static void main(String[] args) {
        
        // 1. Adding an element

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5); // inserts 5 at the 5th index in l1        
        System.out.println(l1);

        // 2. Removing an element:
        System.out.println("Array list before removing value : "+l1);
        l1.remove(0);
        System.out.println("Array list after removing value : "+l1);

        // 3. Cheaking if an ArrayList contains a specific value or not:
        System.out.println("Array List : "+l1);
        System.out.println("l1 List contains 7 : "+l1.contains(7)); // false
        System.out.println("l1 List contains 4 : "+l1.contains(4)); // true

        // 4. Finding the first occurrence of a specified number in the ArrayList:
        System.out.println("l1 Array List : "+l1);
        System.out.println("The first occurrence of 3 in l1 is at index : "+l1.indexOf(3));
        
    }
}
