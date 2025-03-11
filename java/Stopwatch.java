import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to start the stopwatch.");
        sc.nextLine();
        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to stop the stopwatch.");
        sc.nextLine();
        long endTime = System.currentTimeMillis();

        System.out.println("Elapsed Time: " + (endTime - startTime) / 1000.0 + " seconds.");
    }
}
