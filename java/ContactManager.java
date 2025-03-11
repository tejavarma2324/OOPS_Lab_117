import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) { // Outer loop: Handles the menu and user choices
            System.out.println("1. Add Contact  2. View Contacts  3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    while (true) { // Inner loop: Allows multiple entries at once
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter phone number: ");
                        String phone = sc.nextLine();
                        contacts.put(name, phone);

                        System.out.print("Do you want to add another contact? (yes/no): ");
                        String response = sc.nextLine();
                        if (!response.equalsIgnoreCase("yes")) break; // Exit inner loop
                    }
                    break;
                case 2:
                    System.out.println("Contacts:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (String key : contacts.keySet()) { // Iterating through contacts using a loop
                            System.out.println(key + ": " + contacts.get(key));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
