import java.util.Scanner;
import java.util.Arrays;
public class findelementinmatrix {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int row = sc.nextInt();
        System.out.println("Enter the col");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        boolean found= false;

        for (int i = 0; i < row; i++) {
            for(int j  =0; j<col;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the searched no");
        int sear = sc.nextInt();
        for(int i=0; i<row;i++){
            for(int j =0;j<col ; j++) {
                if (arr[i][j] == sear) {
                    System.out.println("element found");
                    found = true;
                }
            }

        }
        if ((!found)) {
            System.out.println("element no found");

        }

    }
}
