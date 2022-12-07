
// day-99 100daysofcodechallenge

// Q1. Created a class and a method with deprecated annotation. 
// What is its effect on program execution?

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1 ");
    }
}

public class A_Practice_99 {
    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}
