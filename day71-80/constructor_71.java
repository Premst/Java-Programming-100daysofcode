//#73

// day-71 100daysofcodechallenge
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i = 10;
        System.out.println("Good Morning!");
    }
}

public class constructor_71 {   
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Prem");
        MyThread t2 = new MyThread("Rohan");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is "+t1.getId());
        System.out.println("The name of the thread t is "+t1.getName());
        System.out.println("The id of the thread t is "+t2.getId());
        System.out.println("The name of the thread t is "+t2.getName());
       
    }
}
