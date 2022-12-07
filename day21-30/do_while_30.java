
// do-while loop

public class do_while_30 {
    public static void main(String[] args) {
        // Print 1 to 10

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);

        // addition of 1 to 10 using do-while loop
         int j = 1; 
         int sum = 0;
         do{
             sum = sum+j;            
             j++;
         }
         while(j<=10);
         System.out.println(sum);
    }
}
