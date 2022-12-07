//#58
// Inheritance in Interface
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meht 1 ");
    }
    public void meth2(){
        System.out.println("meht 2 ");
    }
    public void meth3(){
        System.out.println("meht 3 ");
    }
    public void meth4(){
        System.out.println("meht 4 ");
    }   
}
public class inheritance_interface_58 {
    public static void main(String[] args) {
        MySampleClass abc = new MySampleClass();
        abc.meth1();
        abc.meth2();
        abc.meth3();
        abc.meth4();
    }
}
