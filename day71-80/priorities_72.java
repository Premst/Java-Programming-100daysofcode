// #74 
// Day-72 100daysofcodechallenge
// Java Thread Priorities 
class priorities1 extends Thread{
    public void run(){
        System.out.println("I'm thread : "+Thread.currentThread().getName());
        System.out.println("I'm thread : "+Thread.currentThread().getPriority());
    }
}
public class priorities_72 {
    public static void main(String[] args) {
        priorities1 t1 = new priorities1();
        priorities1 t2 = new priorities1();
        t1.setPriority(Thread.MIN_PRIORITY); //setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY); //setting priority of t2 thread to MAX_PRIORITY (10)
        t1.start();
        t2.start();

    }
}
