
// day-39 100daysofcode

// Multiplication of matrices in Java

import java.util.Scanner;
public class mult_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mult = new int[3][3];

        // enter mat1 and mat2 elements
        System.out.println("Enter 3*3 matrix of mat1 : ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                mat1[i][j] =sc.nextInt(); 
            }
        }    
        System.out.println("Enter 3*3 matrix of mat2 : ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                mat2[i][j] =sc.nextInt(); 
            }
        }
        // displaying mat1 and mat2 elements
        System.out.println("Displaying of mat1 elements : ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Displaying of mat2 elements : ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat2[i][j]+ " ");
            }
            System.out.println();
        }
        // multiplicaiton of mat1 and mat2
        System.out.println("Multiplication of mat1 and mat2");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mult[i][j] = 0;
                for(int t=0; t<3; t++){
                    mult[i][j] = mult[i][j]+mat1[i][t]*mat2[t][j];
                }
                System.out.print(mult[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
