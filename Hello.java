public class Hello {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please type your name in the textbox.");
            return;
        }

        String name = args[0];

        System.out.println("Program: Hello.java");
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to the Cloud Java Runner.");
    }
}
