// day-26 100daysofcode

public class str_ps_26 {
    public static void main(String[] args) {

        // Qustion 1 - convert a string to lower case
        System.out.println("Question 1");
        String name = "Hello, This is Prem ";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2 - replace space with underscores
        System.out.println("Question 2");
        String text = "Hello my  friends";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Question 3 - letter formate types
        System.out.println("Question 3");
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", " Prem ");
        System.out.println(letter);

        // Question 4 - detect double and triple spaces in a string
        System.out.println("Question 4");
        String myString = "This string contains double and triple spaces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("  "));

        // Question 5 - escape sequence characters.
        System.out.println("Question 5");
        String  myLetter = "Hello everyone, \n\t Java course is nice. \n Thansks!";
        System.out.println(myLetter);
    }
}
