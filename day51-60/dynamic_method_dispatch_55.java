// #49
// Dynamic Method Dispatch in Java
class phone{
    public void showtime(){
        System.out.println("showing time");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on smart phone");
    }
}
public class dynamic_method_dispatch_55 {
    public static void main(String[] args) {
       
       phone obj = new smartphone();
       obj.on();
       obj.showtime();
    //    obj.music();   Not Allowed
    }
}

