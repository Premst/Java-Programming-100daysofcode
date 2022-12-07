// day-54 100daysofcodechallenge
// Constructor in inheritance 
class Base1{
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as : "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor derived with value of y as : "+y);
    }
}
class ChileOfDerived extends Derived1{
    ChileOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChileOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived with value of z as : "+z);
    }
}
public class constructori_in_inheritance_54 {
    public static void main(String[] args) {
        System.out.println("Base class");
        Base1 b = new Base1();
        System.out.println("Derived class");
        Derived1 d = new Derived1();
        System.out.println("Derived class with overloaded");
        Derived1 d1 = new Derived1(12, 13);
        System.out.println("Child class");
        ChileOfDerived cd = new ChileOfDerived();
        System.out.println("child class with overloaded");
        ChileOfDerived cd1 = new ChileOfDerived(14, 15, 16);
    }
}
