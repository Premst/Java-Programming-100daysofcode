import javax.xml.stream.XMLOutputFactory;

// day-32 100daysofcode
public class array_ps_32 {
    public static void main(String[] args) {

        // Problem 1: create an array of 5 floats and calculate their sum
        float[] marks = {45.7f, 65.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("The value of sum is : " + sum);

        // Problem 2: given integer is present in an array or not
        int[] value = {12, 13, 14, 41, 15};
        int num = 13;
        Boolean isIsArray = false;
        for(int element:value) {
            if(num==element){
                isIsArray = true;
                break;
            }
        }
        if(isIsArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

        // Preblem 3: calculate the average marks from an array
        int[] avgMarks = {40, 50, 70, 60, 30};
        int avg = 0;
        for(int element:avgMarks){
            avg = avg +element;
        }
        System.out.println("The value of average marks is " + avg/avgMarks.length);

        // Problem 4: add two matrices
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] result = {{0, 0}, {0, 0}};
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat2[i].length; j++){
                System.out.format("setting value for i = %d and j= %d \n",  i, j);
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat2.length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Problem 5: print reverse order in an array
        int[] arr = {12, 22, 33, 44, 32, 11, 25, 83};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int a=0; a<n; a++){
            temp = arr[a];
            arr[a] =arr[l-a-1];
            arr[l-a-1]=temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }

        // Problem 6: find maximum element in an array
        int[] numbers = {12, 13, 14, 55, 33, 45};
        int max = 0;
        for(int e:numbers){
            if(e>max){
                max = e;
            }
        }
        System.out.println("\nThe value of the maxium element in this array is : " + max);

        // System.out.println(Integer.MAX_VALUE);

        // Problem 7: find whether an array is sorted or not
        boolean isSorted = true;
        int[] array = {1, 2, 3, 4, 7};
        for(int b=0; b<array.length-1; b++){
            if(array[b]>array[b+1]){
               isSorted = false;
                break; 
            }            
        }
        if(isSorted){
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
