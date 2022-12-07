
// Error(Example hai bro)

public class method_acc_mu_35 {
    private int roll;
    private String name;
    public int getRoll(){ // accessor method
        return roll;
    }
    public void setRoll(int roll){ // mutator method
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Roll No. : " + roll);
        System.out.println("Student name : " + name);
    }
}
