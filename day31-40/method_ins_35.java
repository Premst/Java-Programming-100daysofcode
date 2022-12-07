// Instance Method

public class method_ins_35 {
    public static void main(String[] args) {
        // Creating an object of the class
        method_ins_35 obj = new  method_ins_35();
        // Invoking instance method
        System.out.println("The sum is : " + obj.add(12,13));
    }
    int s;
    // user-defined method because we have not used static keyword
    public int add(int a, int b){
        s = a+b;
        // returning the sum
        return s;
    }
}
