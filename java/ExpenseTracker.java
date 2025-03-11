import java.util.Random;

public class MazeGenerator {
    public static void main(String[] args) {
        int rows = 10, cols = 10;
        char[][] maze = new char[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < cols; j++) { // Inner loop for columns
                maze[i][j] = random.nextBoolean() ? '#' : ' ';
            }
        }

        maze[0][0] = 'S'; // Start
        maze[rows - 1][cols - 1] = 'E'; // End

        for (char[] row : maze) { // Loop to print the maze
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
