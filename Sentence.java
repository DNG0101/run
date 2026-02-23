public class Sentence {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Enter a sentence in the textbox.");
            return;
        }

        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            sentence.append(args[i]).append(" ");
        }

        System.out.println("Program: Sentence.java");
        System.out.println("You entered:");
        System.out.println(sentence.toString());
    }
}
