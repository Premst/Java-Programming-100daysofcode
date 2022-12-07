//102
// day-92 100daysofcodechallenge
// Java practice 
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
public class ad_ps_92 {
    public static void main(String[] args) {
        // Q.1 Create an ArrayList and store the names of ten stuedent inside it.
        // Print it using for each loop.

        ArrayList ar = new ArrayList<>();
        ar.add("Student 1 : ");
        ar.add("Student 2 : ");
        ar.add("Student 3 : ");
        ar.add("Student 4 : ");
        ar.add("Student 5 : ");
        ar.add("Student 6 : ");
        ar.add("Student 7 : ");
        ar.add("Student 8 : ");
        ar.add("Student 9 : ");
        ar.add("Student 10 : ");
        for(Object o:ar){
            System.out.println(o);
        }

        // Q.2 Use the Date class in java to print the time in the folling format:
        // 22:12:3 

        // Date d = new Date();
        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Q.3 Repeat question number 2 using the Calender class.
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
