// #57
// day-58 100daysofcodechallenge
// Java Interface Example and Default Methods
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording  in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
    
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Taking video...");
    }
    // public void record4KVideo(){
    //     System.out.println("Recording smartphone in 4k video...");
    // }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Prem", "Anil", "Rohan"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
        
    }
}
public class default_method_58 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet();   --> throws an error
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
