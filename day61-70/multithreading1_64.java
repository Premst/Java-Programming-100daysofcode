//#69

// With Multithreading

class multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}
public class multithreading1_64 {
    public static void main(String[] args) {
        multi m1 = new multi();
        m1.start();
        multi m2 = new multi();
        m2.start();
    }
}
