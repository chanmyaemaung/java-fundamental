public class Method {
    public static void main(String[] args) throws Exception {
        // greetUser();
        System.out.println("The result of multiplying 5 and 10 is: " + multiplyTwoNumbers(5, 10));
        System.out.println("The result of adding 5 and 10 is: " + addTwoNumbers(5, 10));
    }

    public static void greetUser() {
        System.out.println("Hello, user!");
    }

    public static int multiplyTwoNumbers(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
