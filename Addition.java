public class Addition {

    public static void main(String[] args) {

        // check if user entered enough values
        if (args.length < 2) {
            System.out.println("Error: Please enter two numbers in the textbox (example: 5 10)");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int sum = a + b;

            System.out.println("Program: Addition.java");
            System.out.println("First Number  : " + a);
            System.out.println("Second Number : " + b);
            System.out.println("Sum = " + sum);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter only numbers.");
        }
    }
}
