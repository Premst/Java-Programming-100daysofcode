// #54 interface explaned #55 
// Abstraction vs interface in java
interface Bicycle{
    int a = 48;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn();
    void blowHorn1();
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorm(){
        System.out.println("Pee Pee Pee...");
    }
    public void applyBrake(int decrement){
        System.out.println("Applaying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHorn(){
        System.out.println("Horn poo poo poo...");
    }
    public void blowHorn1(){
        System.out.println("Horn1 poo pee poo...");
    }
}
public class abstract_vs_interface_57 {
    public static void main(String[] args) {
        AvonCycle A1 = new AvonCycle();
        A1.applyBrake(2);
        // You can create properties in Interface
        System.out.println(A1.a);
        /*  You cannot modify the properties in interface as they are final
        A1.a = 50;  
        System.out.println(A1.a);   */ 
        A1.blowHorn();
        A1.blowHorn1();
    }
}
