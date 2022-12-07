
// Lambda Epression :

@FunctionalInterface

interface LambaExp{
    void meth1(int a, int b);
} 

public class LambaExpDemo_96 {
    public static void main(String[] args) {
        LambaExp abc = (a,b)->{
            System.out.println("The value of a and b is : "+a+","+b);
        };
        abc.meth1(12, 13);
    }
}
