

// day-45 100daysofcode

// Enter 3 digits integer number and find the sum of its digits

import java.util.Scanner;
public class digits_sum_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0 ;
        System.out.println("Enter any 3 digits integer number ");
        int n = sc.nextInt();
        while(n!=0){
            int r = n%10;
            s = s+r;
            n = n/10;
        }
        System.out.println("The sum of digits = "+s);
    }
}
