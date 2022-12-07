
// Q2. Suppress the warning generated in question number 2.

class MyDeprecated{
    @Deprecated
    void meht2(){
        System.out.println("I am method 2");
    }
}

public class A_Practice1_99 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        MyDeprecated d1 = new MyDeprecated();
        d1.meht2();
    }
}
