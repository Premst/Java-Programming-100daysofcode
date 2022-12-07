
// day-44 100daysofcode

// check prime number or not
import java.util.Scanner;
public class prime_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i = 2; i<n; i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;
            }
            if(i==n){
                System.out.println("Prime");
            }
        }
    }
}
