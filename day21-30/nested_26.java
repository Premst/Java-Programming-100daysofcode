// Nested if statement

public class nested_26 {
    public static void main(String[] args) {
        int age = 24;
        int weight = 47;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
            else{
                System.out.println("You are not eligible to donate blood");
            }
        }
        else{
            System.out.println("Age must be greater than 18");
        }
    }
}
