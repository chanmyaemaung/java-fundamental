import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) throws Exception {
        Scanner victor = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = victor.nextInt();

        switch (age) {
            case 17:
                System.out.println("Sorr, you are not old enough to drive.");
                break;
            case 18:
                System.out.println("You are old enough to drive.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        victor.close();
    }
}