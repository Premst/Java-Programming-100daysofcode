// day-42 100daysofcode
// check palindrom number or not
import java.util.Scanner;
public class palind_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int t = n;
        while(n!=0){
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        if(t==rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
