import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class maximumscalarproduct {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int scalarproduct=0;
        for(int i=0; i<n ; i++){
            scalarproduct+= arr1[i] * arr2[i];
        }
        System.out.println(scalarproduct);
    }
}
