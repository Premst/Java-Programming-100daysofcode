
// find fabbonices series.

import java.util.Scanner;
public class fabbonices_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int f1 = -1;
        int f2 = 1;
        System.out.println("Enter nth number : ");
        int n = sc.nextInt();
        while(i<=n){
            int f3 = f1+f2;
            System.out.print(f3+", ");
            f1 = f2;
            f2 = f3;
            i++;
        }
    }
}
