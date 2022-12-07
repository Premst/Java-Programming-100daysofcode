// #66
// day-62 100daysofcodechallenge
class modifiers{
    public int x = 12;
    protected int y = 13;
    int z = 14;
    private int a = 15;
    public void access(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class modifiers_62 {
    public static void main(String[] args) {
        modifiers m = new modifiers();
        // m.access();
        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(m.z);
        // System.out.println(m.a); --> throw error(Private)
    }
}
