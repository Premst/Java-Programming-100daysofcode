


class base{
    public void print_b(){
        System.out.println("Base class");
    }
}
class child extends base{
    public void print_c(){
        System.out.println("child/derived class");
    }
}

public class inher_02_52 {
    public static void main(String[] args) {
        child a = new child();
        a.print_b();
        a.print_c();
    }
}
