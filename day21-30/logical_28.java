// day-28 100daysofcode

public class logical_28 {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        System.out.println("For logical AND...");
        if(a&&b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("For logical OR...");
        if(a||b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("For logical NOT...");
        System.out.println("NOT(a) is : " + !a);
        System.out.println("NOT(b) is : " + !b);
    }
}
