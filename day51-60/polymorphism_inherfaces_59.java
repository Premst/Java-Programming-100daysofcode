//day-59 100daysofcodechallenge
// Polymorphism in interface
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }   
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k video...");
    } 
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap video");
    }
    // public void recordVideo(){
    //     System.out.println("Taking snap and recordign in 4k");
    // }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Prem", "Vikash", "Rohan"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}
public class polymorphism_inherfaces_59 {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
        // cam1.getNetworks(); -->Not allow
        // cam1.sampleMeth(); -->Not allow
        cam1.record4kVideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(121);
    }
}
