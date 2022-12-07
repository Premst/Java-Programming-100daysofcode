
// day-41 100daysofcode

// Inverted half pyramid


public class half_pyr_pat_41 {
    public static void main(String[] args) {
        for(int i=10; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
