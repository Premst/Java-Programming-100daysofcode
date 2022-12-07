
// Convert Decimal number to Binary number in java

import java.util.Scanner;
public class dec_to_bin_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] rem;
        rem = new int[20];
        System.out.println("Enter any integer number : ");
        int n = sc.nextInt();
        while(n>0){
            rem[i]=n%2;
            i++;
            n=n/2;
        }
        System.out.print("Binary no. = ");
        for(int j=i-1; j>=0; j--){
            System.out.print(rem[j]);
        }
    }
}
