import java.util.Scanner;
import java.util.Arrays;
public class findmedianmatrix {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("Enter the col");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for(int j  =0; j<col;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[index++] = arr1[i][j];
            }
        }


        Arrays.sort(arr);

        double median;
        int n = arr.length;
        if (n % 2 == 1) {

            median = arr[n / 2];
        } else {

            median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }


        System.out.println("Median of the matrix is: " + median);
    }
}


