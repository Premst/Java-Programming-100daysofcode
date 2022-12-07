// #100
// day-90 100daysofcodechallenge
// java.time API in java
import java.time.*;
public class java_time_api_90 {
    public static void main(String[] args) {
// 1. Clock Class: getZone(): and instant():
        Clock cl = Clock.systemDefaultZone();
        System.out.println("Time Zone : "+cl.getZone());
        Clock cl1 = Clock.systemUTC();
        System.out.println("The current instant of the clocks : "+cl1.instant());

// 2. Duration class: boolean isNegarive(): and isZero():
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);
        System.out.println(d1.isNegative());
        System.out.println(d1.isZero());
        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        System.out.println(d2.isNegative());
        System.out.println(d2.isZero());

// 3. LocalDate Class: and compareTo():
        LocalDate d = LocalDate.now();
        System.out.println("Date : "+d);
        LocalDate dc1 = LocalDate.parse("2022-11-25");
        LocalDate dc2 = LocalDate.parse("2022-11-26");
        LocalDate dc3 = LocalDate.parse("2022-11-25");
        System.out.println("Equal date or not : "+dc1.equals(dc2));
        System.out.println("Equal date or not : "+dc1.equals(dc3));        
        System.out.println("Change Year with current Date : "+d.withYear(2025));
    }
}
