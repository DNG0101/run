public class Addition {
    public static void main(String[] args) {

        if(args.length < 2){
            System.out.println("Please provide two numbers.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Sum = " + sum);
    }
}
