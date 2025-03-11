import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // Outer loop for multiple conversions
            System.out.print("Enter distance in kilometers (or type '-1' to exit): ");
            double kilometers = sc.nextDouble();
            if (kilometers == -1) break;

            for (int i = 1; i <= 1; i++) { // Inner loop for repeated confirmation
                double miles = kilometers * 0.621371;
                System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
            }
        }
    }
}
