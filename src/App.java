public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ClassesAndAccessModifier person = new ClassesAndAccessModifier();

        // Override the default value
        person.name = "Chen Lay";

        // String info = "My name is " + person.name + " and I am " + person.age + "
        // years old.";

        person.logMyInfo();
    }
}
