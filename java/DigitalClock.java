import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        int hoursToDisplay = 1; // Display clock for 1 hour
        for (int i = 0; i < hoursToDisplay * 3600; i++) { // Outer loop for 1 hour
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            System.out.print("\r" + formatter.format(date));

            // Inner loop for 1-second intervals
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}
