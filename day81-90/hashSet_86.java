// day-86 100daysofcodechallenge 
// HashSet in Java
import java.util.HashSet;
public class hashSet_86 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();

        // 1. Inserting elements:
        h1.add(11);
        h1.add(12);
        h1.add(13);
        h1.add(14);
        h1.add(15);
        h1.add(16);
        h1.add(16); // This element will be ignored
        System.out.println(h1);

        // 2. Removing element from the HashSet:
        System.out.println("HashSet before removing element : "+h1);
        h1.remove(12); // delete 12 from the hashSet
        System.out.println("HashSet after removing element : "+h1);

        // 3. Checking if the HashSet is empty or not:
        HashSet<Integer> h2 = new HashSet<>();

        System.out.println(h1.isEmpty()); // false
        System.out.println(h2.isEmpty()); // true

        // 4. Printing the size of the HashSet:
        System.out.println("The size of h1 is : "+h1.size());

        // 5. Removing all the element from the HashSet:
        System.out.println("h1 before removing : "+h1);
        h1.clear(); // delete all the element from the HashSet h1
        System.out.println("h1 after removing : "+h1);
    }
}
