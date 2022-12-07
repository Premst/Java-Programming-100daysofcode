
// day-34 100daysofcode

import java.util.Scanner;

public class method_ps_34 {
    public static void main(String[] args){
        // Problem-1
        // Using the max() method to find maximum
        System.out.println("The maximum number is : " + Math.max(9,7));

        // Problem-2
        // Invoke a user-defined method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");        
        // reading value from the user 
        int num = scan.nextInt();
        // method calling
        findEvenOdd(num);

    }
    // user defind method
    public static void findEvenOdd(int num){
        // method body
        if(num%2==0)
        System.out.println(num+" is even");
        else
        System.out.println(num+" is odd");

    }
}
