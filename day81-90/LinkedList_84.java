// #92
// day-84 [LinkedList in Java : Demo and Methods]
import java.util.LinkedList;
public class LinkedList_84 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // 1. Adding element in Linked List: 
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,66); // Insert 77 at index 5
        System.out.println("L1 Linked List : "+l1);

        // 2. Removing an element from the Linded List:
        System.out.println("L1 Linked List before removing : "+l1);
        l1.remove(3); // remove element present at 3rd index
        System.out.println("L1 Linked List after removing : "+l1);

        // 3. Changing an element of Linked List:
        System.out.println("L1 Linked List before changing : "+l1);
        l1.set(2,20); // Changes element present at 2nd index (33 changed to 20)
        System.out.println("L1 Linked List after changing : "+l1);

        // 4. Inserting an element at the start of the linked list:
        System.out.println("L1 Linked List before inserting element (first) : "+l1);
        l1.addFirst(100); // Inserting 100 at the start of L1
        System.out.println("L1 Linked List after inserting element (first) : "+l1); 

        // 5. Inserting an element at the last of the linked list:
        System.out.println("L1 Linked List before inserting element (Last) : "+l1);
        l1.addLast(200); // Inserting 200 at the end of L1
        System.out.println("L1 Linked List after inserting element (Last) : "+l1);        
    } 
}
