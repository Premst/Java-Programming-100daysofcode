// day-93 100daysofcodechallenge

//  JavaDocs

public class javaDocs_93 {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word! \n " + "Plagiarism!");
    }
    public static void main(String[] args) {
        tellJoke();

        // case1: changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is : "+ x);

        // case2: change the Array
        int [] marks = {50, 60, 88, 77, 98, 99};
        change2(marks);
        System.out.println("The value of x after running change is : "+marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        
    }
}
