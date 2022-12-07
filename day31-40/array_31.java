
// day-31 100daysofcode

/**
 * array_31
 */
import java.util.Scanner;
public class array_31 {

    public static void main(String[] args) {
        int[]  number= {12, 13, 14, 41, 55};
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        
        // displaying using for loop
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }

        // displaying reverse order using for loop
        for(int j=(number.length-1); j>=0; j--){
            System.out.println(number[j]);
        }

        // displaying using for each loop
        for(int element: number){
            System.out.println(element);
        }
      
    }
}