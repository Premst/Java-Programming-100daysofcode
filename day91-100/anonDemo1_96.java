
// day-96 100daysofcodechallenge

// Java Anonmous Classes & Lambda Expression

@FunctionalInterface
interface Animal{
    void bark();
}
class Dog implements Animal{
    @Override
    public void bark(){
        System.out.println("Dog barks!");
    }
}

public class anonDemo1_96 {
    public static void main(String[] args) {
        Dog Tomy = new Dog();
        Tomy.bark();
    }
}
