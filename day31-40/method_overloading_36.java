
// day-36 100daysofcode

// Method Overloading: changing no. of arguments

class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class method_overloading_36 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12,14,15));
    }
}
