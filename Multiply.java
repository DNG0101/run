public class Multiply {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Error: Please enter two numbers (example: 4 7)");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int result = a * b;

            System.out.println("Program: Multiply.java");
            System.out.println("First Number  : " + a);
            System.out.println("Second Number : " + b);
            System.out.println("Product = " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Numbers only.");
        }
    }
}
