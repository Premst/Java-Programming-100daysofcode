//#70
// day-65 100daysofcodechallenge
// Java Thread Using Thread class

class mythread1 extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("My cooking thread is running...");
            System.out.println("I am happy!");
        }
    }
}
class mythread2 extends Thread {
    @Override 
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Thread 2 for chatting with her...");
            System.out.println("I am said!");
        }
    }
}

public class multithreading2_65 {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }    
}