

// Q3. Create an interface and generate an instance form it.

interface MyInt{
    void display();
}

public class A_Practice2_99 {
    public static void main(String[] args) {
        MyInt i = () -> System.out.println("I am display");
        i.display();
    }
}
