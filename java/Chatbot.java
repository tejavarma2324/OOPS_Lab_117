import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // Outer loop for conversation
            System.out.print("You: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Bye! Have a great day!");
                break;
            }

            for (int i = 1; i <= 1; i++) { // Inner loop for extra responses
                System.out.println("Chatbot: Hmm, interesting! Tell me more.");
            }
        }
    }
}
