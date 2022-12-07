

/**
 * twoD_array_31
 */
public class twoD_array_31 {

    public static void main(String[] args) {
        int[][] number;
        number = new int[2][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number[i].length; j++){
                System.out.print(number[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}