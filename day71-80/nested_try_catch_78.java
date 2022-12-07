// #82
// Nested Try-Catch in java
import java.util.Scanner;
public class nested_try_catch_78 {
        public static void main(String[] args) {
            int[] numbers = new int[4];
            numbers[0] = 12;
            numbers[1] = 13;
            numbers[2] = 14;
            numbers[3] = 15;
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while(flag){
                System.out.println("Enter the value of index : ");
                int ind = sc.nextInt();
                try{
                    System.out.println("Welcome to nested try catch");
                    try{
                        System.out.println(numbers[ind]);
                        flag = false;
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Sorry this index does not exist");
                        System.out.println("Exception in level 2");
                    }
                }
                catch(Exception e){
                    System.out.println("Exception in level 1");
                }
            }
            System.out.println("Loop end!");
        }
    }
    