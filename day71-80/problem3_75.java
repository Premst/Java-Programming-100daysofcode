
/* Demonstrate getPriority() and setPriority() methods
   in java Threads. */

class Thread5 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thread6 extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}
public class problem3_75 {
    public static void main(String[] args) {
        Thread5 t5 = new Thread5();
        Thread6 t6 = new Thread6();
        t5.start();
        t6.start();
        t5.setPriority(5);
        t6.setPriority(1);
        System.out.println(t5.getPriority());
        System.out.println(t6.getPriority());
    }
}





// /**
//  * ASCII CODES
//  */
// public class problem3_75 {

//     public static void main(String[] args) {
//         for(char i=48; i<=57; i++){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         for(char i=65; i<=90; i++){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         for(char i=97; i<=122; i++){
//             System.out.print(i+" ");
//         }
//     }
// }