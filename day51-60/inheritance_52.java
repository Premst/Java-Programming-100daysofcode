
// day-52 100daysofcode

class base{
    public int x;
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void msg(){
        System.out.println("I am a message");
    }
}
class derived extends base{
   public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}

public class inheritance_52 {
    public static void main(String[] args) {
        // creating an object of base class
        base b = new base();
        b.setX(12);
        System.out.println(b.getX());

        // creating an object of derived class
        derived d = new derived();
        d.sety(13);
        System.out.println(d.gety());
    }
}
