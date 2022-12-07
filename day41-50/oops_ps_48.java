import java.rmi.Remote;

// day-48 100dayofcode 

// Create employee class

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void CallFriend(){
        System.out.println("Calling Sandeep...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class oops_ps_48 {
    public static void main(String[] args) {
   
        // Problem 03
        
        Square ab = new Square();
        ab.side = 5;
        System.out.println(ab.area());
        System.out.println(ab.perimeter());

    }
}

    
    /*      // Problem 01
        Employee prem = new Employee();
        prem.setName("PremKumar");
        prem.salary = 1000;
        System.out.println(prem.getSalary());
        System.out.println(prem.getName());

        // Problem 02

        CellPhone realme = new CellPhone();
        realme.CallFriend();
        realme.vibrate();
        realme.ring();*/