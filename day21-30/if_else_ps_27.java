// day-27 100daysofcode 

import java.util.Scanner;
public class if_else_ps_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check the no. is even or odd
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number ");
        }

        // check leap year
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year + " is a leap year!");
        }
        else{
            System.out.println(year + " is not a leap year!");
        }

    }
}
