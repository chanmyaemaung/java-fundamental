import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) throws Exception {
        Scanner victor = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = victor.nextInt();

        if (age < 18) {
            System.out.println("Sorr, you are not old enough to drive.");
        } else if (age >= 18) {
            System.out.println("You are old enough to drive.");
        } else {
            System.out.println("Invalid input.");
        }

        victor.close();
    }
}
