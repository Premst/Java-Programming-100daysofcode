// #93
// day-85 100daysofcodechallenge
// ArrayDeque in Java
import java.util.ArrayDeque;
public class ArrayDeque_85 {
    public static void main(String[] args) {        
        ArrayDeque<Integer> ab = new ArrayDeque<>();

// 1. Inserting an element: add(), offerFirst(), offerLast(), addFirst();
        ab.add(23);
        ab.add(12);
        ab.add(25);
        ab.add(28);
        ab.add(7);
        ab.add(5);
        ab.addFirst(1);
        ab.offerFirst(10);
        ab.offerLast(30);
        System.out.println(ab);

// 2. Accessing an element from the head of the deque array:
        // getFirst() and peekFirst();
        System.out.println(ab.getFirst());
        System.out.println(ab.peekFirst());
        // getLast() and peekLast()
        System.out.println(ab.getLast());
        System.out.println(ab.peekLast());

// 3. Removing the first element: removeFirst() and pollFirst()
        ab.pollFirst();
        ab.removeFirst(); 
        System.out.println(ab);
        // removLast() and pollLast()
        ab.pollLast();
        ab.removeLast();
        System.out.println(ab);
    }
}
