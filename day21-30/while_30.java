
// day-30 100daysofcode

import java.util.Scanner;;
public class while_30 {
    public static void main(String[] args) {

        // print 1 to 10 using while loop
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        // addition of 1 to 10

        int a = 1;
        int s = 0;
        while(a<=10){
            s = s+a;
            a++;
        }
        System.out.println(s);

        //  factorial number
        Scanner scan = new Scanner(System.in);
        int f = 1;
        System.out.println("Enter any integer number : ");
        int n = scan.nextInt();
        while(n!=0){
            f=f*n;
            n--;
        }
        System.out.print("factorial number : " + f);

        // multiplication table
        int t = 1;
        System.out.println("\nEnter number for table : ");
        int t1 = scan.nextInt();
        while(t<=10){
            int table = t1*t;
            System.out.println(t1+ " * " + t + " = " + table);
            t++;
        }


    }
}
