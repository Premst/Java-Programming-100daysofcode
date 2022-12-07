// #101
// day-91 100daysofcodechallenge

// DateTimeFormatter in Java

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatter_91 {
    public static void main(String[] args) {
        // 1. date formattin
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : "+dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formattin : "+myDate);

        // 2. ISO_LOCAL_DATE:
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE; // Formatting the data in the ISO format
        String myDate1 = dt.format(df1); // Creating date string using date and format
        System.out.println("Date in ISO format : "+myDate1);

        // 3. ISO_ORDINAL_DATE:
        DateTimeFormatter df2 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println("Date in ISO_WEEK_DATE Format : "+myDate2);
    }
}
