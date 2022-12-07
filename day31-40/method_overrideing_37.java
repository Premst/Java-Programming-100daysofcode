
// day-37 100daysofcode

// Java Program to demonstrate why we need method overriding

// Here, we are calling the method of parent class with child
// class object
// Creating a parent class

 class method_overrideing_37 {
    void run(){
        System.out.println("Example of method overrinding");
    }
}
// Creating a child class
class bike extends method_overrideing_37{
    public static void main(String[] args) {
        // Creating an instance of child class
        bike obj = new bike();
        // calling the method with child class instance
        obj.run();
    }
}
