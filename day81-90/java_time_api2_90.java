
// day-90 100daysofcodechallenge

// java.time API - Class and Methods

import java.time.*;;
public class java_time_api2_90 {
    public static void main(String[] args) {
        // 4. LocalTime class:
        LocalTime t = LocalTime.now();
        System.out.println("Current time : "+t);

        // LocalTime plusHours(long hoursToAdd):
        LocalTime  t1 = t.plusHours(2);
        System.out.println("Time after adding 2 h in current time : "+t1);

        // LocalTime minusMinutes(long minutesToSubtract):
        LocalTime t2 = t.minusMinutes(5);
        System.out.println("Time after subtracting 5 minutes : "+t2);
    }
}
