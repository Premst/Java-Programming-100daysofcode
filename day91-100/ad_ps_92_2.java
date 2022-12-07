
// #102

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class ad_ps_92_2 {
    public static void main(String[] args) {

        // Q.4 Repeat question number 2 using java.time API.
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:M:S"); // This is the formate
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

        // Q.5 Create a set in java. Try to store the duplicate values element inside this set and verify that only one instance is stored.
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(13);
        s.add(12);
        s.add(8);
        s.add(22);
        s.add(60);
        System.out.println(s);
    }
}
