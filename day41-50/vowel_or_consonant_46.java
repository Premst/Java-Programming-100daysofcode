
// day-46 100daysofcode

// check alphabet vowel or consonant 

import java.util.Scanner;
public class vowel_or_consonant_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        String c = sc.nextLine();
        if(c == "a" || c == "e" || c == "i" || c == "o" || c == "u" || c == "A" || c == "E" || c == "I" || c == "O" || c == "U"){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

    }
}
