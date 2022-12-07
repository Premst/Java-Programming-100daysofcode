

//  By extending a class:

abstract class Vehicle{
    abstract void drive();
}

public class anonDemo3_96 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive(){
                System.out.println("I am driving a car. ");
            }
        };
        car.drive();
    }
}
