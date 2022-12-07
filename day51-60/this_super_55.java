//#47
// day-55 100daysofcode
//  this and super keyword in java
class Sample{
    int a;
    public int getA(){
        return a;
    }
    Sample(int a){
        this.a = a;
        System.out.println("I am a constructor");
    }
}
class other extends Sample{
    other(int b){
        super(b);
        System.out.println("Other constructor");
    }
}
public class this_super_55 {
    public static void main(String[] args) {
       Sample ab = new Sample(12);

       other bc = new other(15);
       System.out.println(ab.getA());
       System.out.println(bc.getA());
    }
}
