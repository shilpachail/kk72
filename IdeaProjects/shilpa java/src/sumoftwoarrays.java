import java.util.Scanner;
import java.util.Arrays;
public class sumoftwoarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter the elements");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = 0;

        if (n > m) {
            max = n;
        } else {
            max = m;
        }

        int[] arrrr3 = new int[max];
        for (int i = 0; i < max; i++) {
            if (i < n && i < m) {
                arrrr3[i] = arr[i] + arr2[i];
            } else if (i < n) {
                arrrr3[i] = arr[i];
            } else {
                arrrr3[i] = arr2[i];
            }

            System.out.println(arrrr3[i]);

        }
    }
}
