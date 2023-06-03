import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) throws Exception {
        Scanner victor = new Scanner(System.in);
        double firstNumber, secondNumber, answer;
        System.out.println("Enter first number: ");
        firstNumber = victor.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = victor.nextDouble();
        answer = firstNumber + secondNumber;
        
        System.out.println("The answer is " + answer + ".");

        victor.close();
    }
}
