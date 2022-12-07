
// day-50 100daysofcode

// Access Modifiers 
// Getters and Setters

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;   // or this.name = n;
    }
    public void setId(int i){
        id = i;     // or this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class oops_50 {
    public static void main(String[] args) {
        
        MyEmployee prem = new MyEmployee();

        prem.setId(48);
        System.out.println(prem.getId());

        prem.setName("PremKumar");
        System.out.println(prem.getName());

    }
}
