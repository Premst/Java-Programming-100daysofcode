
// sum of two values in java

class sum{
    int a;
    int b;
    public void sum_data(){
        int s = a+b;
        System.out.println("The sum of a and b is "+s);
    }
}
public class oops_sum_47 {
    public static void main(String[] args) {
        sum x = new sum();
        x.a = 12;
        x.b = 13;
        x.sum_data();
    }
}
