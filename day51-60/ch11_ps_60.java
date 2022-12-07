import java.net.SocketTimeoutException;

// #60
// day-60 100daysofcodechallenge
// chapter 11 - Practice Question
abstract class Pen{
    abstract void write();
    abstract void refil();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write here...");
    }
    void refil(){
        System.out.println("refil...");
    }
    void changeNib(){
        System.out.println("Change nib....");
    }
}
class Animal{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Animal implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class ch11_ps_60 {
    public static void main(String[] args) {
    //    Problem - 3
        Human prem = new Human();
        prem.sleep();
        // Problem - 5
        Animal A1 = new Animal();
        A1.jump();
        A1.bite();
        
    }
}
 // Problem 1 + 2
        // FountainPen p = new FountainPen();
        // p.write();
        // p.refil();
        // p.changeNib();