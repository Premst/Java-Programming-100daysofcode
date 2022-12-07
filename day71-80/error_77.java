// #79
// day-77 100daysofcodechallenge

// Syntax Error and Logical erron in java

public class error_77 {
    public static void main(String[] args) {
        
        // Syntax error demo

        // int a = 0  // Error: no semicolon!
        // b = 0;  // Error: b not declared!

        // Logical Error demo

        // Write a program to print prime number between 1 to 10.
        System.out.println(2);
        for(int i=1; i<5; i++){
            System.out.println(2*i+1); // Error: (also, print 9) 9 is not prime number
        }
    }
}
