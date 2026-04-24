import java.util.*;
public class sorting2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        int size = r * c;              // total elements
        int[] arr = new int[size];     // 1D array to store all elements
        int index = 0;

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                arr[index++] = mat[i][j];   // copy to 1D array
            }
        }

        // Sort all elements
        Arrays.sort(arr);

        // -------- OPTION 1: Print all sorted elements --------
        System.out.println("\nElements in sorted order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
