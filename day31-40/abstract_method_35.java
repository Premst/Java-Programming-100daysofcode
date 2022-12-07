
// abstract method

abstract class abstract_method_35 { // abstract class
    // abstract method declaration
    
    abstract void display();
}

class MyClass extends abstract_method_35{
    // method implemention
    void display(){
        System.out.println("Abstract method!");
    }
    public static void main(String args[]){
        // creating object of abstract class
        abstract_method_35 abc = new MyClass();

        // invoking abstract method

        abc.display();
    }
}
