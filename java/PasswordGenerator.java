import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        Scanner sc = new Scanner(System.in);

        System.out.print("How many passwords do you want to generate? ");
        int numPasswords = sc.nextInt();

        for (int p = 0; p < numPasswords; p++) { // Outer loop for multiple passwords
            StringBuilder password = new StringBuilder();
            Random random = new Random();
            int length = 12; // Desired password length

            for (int i = 0; i < length; i++) { // Inner loop for characters in each password
                int index = random.nextInt(chars.length());
                password.append(chars.charAt(index));
            }
            System.out.println("Generated Password " + (p + 1) + ": " + password);
        }
    }
}
