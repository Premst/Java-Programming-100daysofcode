


// By implementing an interface:

@FunctionalInterface

interface Human{
    void walk();
}

public class anonDemo4_96 {
    public static void main(String[] args) {
        Human Rohan = new Human() {
            @Override 
            public void walk(){
                System.out.println("John walks");
            }
        };
        Rohan.walk();
    }
}
