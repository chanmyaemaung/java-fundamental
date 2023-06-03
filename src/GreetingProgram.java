import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) throws Exception {
        Scanner victor = new Scanner(System.in);
        String firstName, secondName;
        System.out.println("What is your first name?");
        firstName = victor.nextLine();
        System.out.println("What is your second name?");
        secondName = victor.nextLine();
        System.out.println("Hello, " + firstName + " " + secondName + ".");

        victor.close();
    }
}
