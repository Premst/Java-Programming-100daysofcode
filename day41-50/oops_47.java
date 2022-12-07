
class student{
    int id;
    String name;
    public void detailas(){
        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }
}
public class oops_47 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        s1.id = 48;
        s1.name = "Prem Kumar";

        s2.id = 49;
        s2.name = "Sudhir Kumar";

        s1.detailas();
        s2.detailas();

    }
}
