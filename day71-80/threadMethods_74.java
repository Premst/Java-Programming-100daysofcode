
// day-74 100dasofcodechallenge

// sleep() method in java

public class threadMethods_74 {
    public static void main(String[] args) {
        try{
            for(int i=1; i<=5; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}