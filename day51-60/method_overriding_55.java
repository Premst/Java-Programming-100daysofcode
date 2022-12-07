// #48 
// method overriding in Java
class A{
    public int a;
    public int prem(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override      // optional (check override notation)
    public void meth2(){    // Override
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class method_overriding_55 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
