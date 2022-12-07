
// student class
class student {
    int id;
    String name;

    student() {
        id = 48;
        name = "Prem Kumar";
    }
    
    student(int s2id, String s2name){
        this.id = s2id;
        this.name = s2name;
    }
}

public class constructor_2_51 {
    public static void main(String[] args) {

        student s1 = new student();
        System.out.println("Student id is " + s1.id + " and student name is " + s1.name);
        
        student s2 = new student(49, "Rohan");
        System.out.println("2nd student id is "+ s2.id+" and name is "+s2.name);
    }
}
