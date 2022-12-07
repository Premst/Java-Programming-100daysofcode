
// interrupt() method in java

class interrup1 extends Thread{
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Child Thread");
                Thread.sleep(2000); // child thread is put to sleep for 2000ms.                
            }                              // As soon as child thread goes to sleep main thread interrupts it.            
        }                                  // And, InterruptedException is generated which is handle by the catch block.
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread is running");
    }
}
public class threadMethod2_74 {
    public static void main(String[] args) {
        interrup1 t1 = new interrup1();
        t1.start();
        t1.interrupt();
        System.out.println("Main Thread");
    }
}
