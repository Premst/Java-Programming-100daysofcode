// day-43 100daysofcode
// check number is Armstrom or Not
import java.util.Scanner;
public class armst_43 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int s = 0;
       System.out.println("Enter any number : "); 
       int n = sc.nextInt();
       int t = n;
       while(n!=0){
        int r = n%10;
        s = s+r*r*r;
        n = n/10;
       }
       if(t==s){
        System.out.println("Armstrom");
       }
       else{
        System.out.println("Not Armstrom");
       }
    }
}
