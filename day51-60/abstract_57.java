// #53
// day-57 100daysofcode
// Abstract class and Abstract Methods
abstract class Base{
    public Base(){
        System.out.println("Base class constructor");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void msg();
    abstract public void greet();       
}
class Child extends Base{
    @Override
    public void msg(){
        System.out.println("Good Morning!");
    }    
    // @override
    public void greet(){
        System.out.println("I am message");
    }
}
abstract class Child1 extends Base{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstract_57 {
    public static void main(String[] args) {
        // Base b = new Base(); ---> (error)
        Child c = new Child();
        // Child c1 = new Child1(); ---> (error)
    }
}