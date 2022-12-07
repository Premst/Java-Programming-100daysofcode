/**
 * str_method_25_1
 */
public class str_method_25_1 {

    public static void main(String[] args) {
        String name = "Prem";
        System.out.println(name);

        int value = name.length();
        System.out.print("Length of value : ");
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println("Lower case of value : "+lString);

        String uString = name.toUpperCase();       
        System.out.println("Upper case of value : "+uString);    

        String nonTrimmedString = "            Prem       ";
        System.out.println("Non Trimmed String : "+nonTrimmedString);
      
        String TrimmedString = nonTrimmedString.trim();
        System.out.println("Non Trimmed String : "+TrimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 3));
    }
}