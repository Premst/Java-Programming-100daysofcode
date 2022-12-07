
// Nested swithch statement
public class n_switch_28 {
    public static void main(String[] args) {
        int collegeYear = 2;
        char branch = 'A';
        switch(collegeYear){

            case 1: 
            switch(branch){
                case 'A': System.out.println("C programming");
                break;

                case 'B': System.out.println("C++ programming");
                break;
            }

            case 2: 
            switch(branch){
                case 'A': System.out.println("Java programming");
                break;

                case 'B': System.out.println("HTML programming");
                break;
            }
        }
    }
}
