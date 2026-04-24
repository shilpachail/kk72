
import java.util.*;

public class MaxOnesInRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter matrix elements (0 or 1):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCount = 0;
        int maxRowIndex = -1;


        for (int i = 0; i < row; i++) {
            int count = 0;


            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1)
                    count++;
            }


            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }


        if (maxRowIndex != -1)
            System.out.println("Row " + maxRowIndex + " has maximum number of 1s: " + maxCount);
        else
            System.out.println("No 1s found in the matrix.");
    }
}