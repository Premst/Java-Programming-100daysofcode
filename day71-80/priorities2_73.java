// day-73 100daysofcodechallenge
// Java Thread Priorities Example
class thread2 extends Thread{
    public thread2(String name){
        super(name);
    }
    public void run(){
        // int i = 53;
        int j=0;
        while(j<20){
            System.out.println("Thank you : "+this.getName());
            j++;
        }
    }
}

public class priorities2_73 {
    public static void main(String[] args) {
        thread2 t1 = new thread2("Prem");
        thread2 t2 = new thread2("Rohan");
        thread2 t3 = new thread2("Mohan");
        thread2 t4 = new thread2("Shyam (most important)");
        thread2 t5 = new thread2("Aman");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();    
    }
}
