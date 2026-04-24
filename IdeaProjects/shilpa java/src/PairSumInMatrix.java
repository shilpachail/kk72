import java.util.*;

public class PairSumInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        // Loop for all possible pairs
        for (int i1 = 0; i1 < rows; i1++) {
            for (int j1 = 0; j1 < cols; j1++) {
                for (int i2 = 0; i2 < rows; i2++) {
                    for (int j2 = 0; j2 < cols; j2++) {
                        // Make sure it's not the same element
                        if (!(i1 == i2 && j1 == j2)) {
                            if (arr[i1][j1] + arr[i2][j2] == target) {
                                System.out.println("Pair found: (" + arr[i1][j1] + ", " + arr[i2][j2] + ")");
                                found = true;
                            }
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }

        sc.close();
    }
}

