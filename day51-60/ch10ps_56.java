// #52
class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){        
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }        
}

public class ch10ps_56 {
    public static void main(String[] args) {
        // Circle c = new Circle(12);
        Cylinder cy = new Cylinder(12, 13);
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }
}
