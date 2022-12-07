// #99
// day-89 100daysofcodechallenge
// GregorianCalender Class and TimeZone in java
import java.util.*;
public class gregorianCalender_89 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        // 1. isLoopYear(int year):
        System.out.println(cal.isLeapYear(2000)); // true
        System.out.println(cal.isLeapYear(2022)); // false

        // 2. roll(int field, boolean up):
        System.out.println("Date before rolling : "+cal.getTime());
        cal.roll(Calendar.MONTH, true);
        cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : "+cal.getTime());

        // 3. hashcode():
        System.out.println("Calender : "+cal.getTime());
        System.out.println("The hashcode for this calender is : "+cal.hashCode());

        // 4. TimeZone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
    }
}
