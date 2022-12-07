
// day-95 100daysofcodechallenge

// 1. @Override annotation

class KeyPadPhone{
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}
class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent WhatsApp!");
    }
}

public class annotations_95 {
    public static void main(String[] args) {
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}
