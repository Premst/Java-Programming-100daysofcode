//  #86
// day-81 100daysofcodechallenge
/* Write a program that allows you to keep accessing an array until a valid index is given.
 * If max retries exceed 5 print "Error".
 */
import java.util.Scanner;
public class practice_ch14_81 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 3;
        marks[1] = 6;
        marks[2] = 9;
        marks[3] = 12;
        marks[4] = 13;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is "+marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
