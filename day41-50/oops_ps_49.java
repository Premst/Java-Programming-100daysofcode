

// day-49 100daysofcode

class game{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class oops_ps_49 {
    public static void main(String[] args) {

        game p1 = new game();
        p1.hit();
        p1.run();
        p1.fire();

    }
}
