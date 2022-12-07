


// without creating any separate class

@FunctionalInterface
interface Animal{
    void bark();
}
public class anonDemo2_96 {
    public static void main(String[] args) {
        Animal Tomy1 = new Animal() {
            @Override
            public void bark(){
                System.out.println("Dog barks!");
            }
        };
        Tomy1.bark();
    }
}
