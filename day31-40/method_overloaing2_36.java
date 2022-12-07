

// Method Overlaoding: changing data type of arguments

class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}
public class method_overloaing2_36 {
    public static void main(String[] args) {
        System.out.println(Adder.add(12, 13));
        System.out.println(Adder.add(12.3, 11.1));
    }
}
