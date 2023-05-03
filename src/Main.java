import java.util.*;

public class Main {

    static String FirstName;

    public static void main(String[] args)
    {
        String LastName;

        Scanner USERINPUT = new Scanner(System.in);

        System.out.println("What is your name");
        FirstName = USERINPUT.nextLine();

        System.out.println("Enter Second Name");
        LastName = USERINPUT.nextLine();






        System.out.println("Hello, " + FirstName + "''" + LastName);
    }
}
