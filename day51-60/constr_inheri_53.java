

// day-53 100daysofcodec
// constructor in inheritance
class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor");
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

}
class Derived1{
    public int y;
    Derived1(){
        System.out.println("Derived class constructor message");
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class constr_inheri_53 {
    public static void main(String[] args) {
        Base1 b1 = new Base1();
        b1.setX(12);
        System.out.println("base class value : "+b1.getX());
    
        Derived1 d1 = new Derived1();
        d1.setY(13);
        System.out.println("derived clas value : "+d1.getY());
    }
}
