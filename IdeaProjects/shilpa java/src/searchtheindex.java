import java.util.Scanner;
import java.util.Arrays;
public class searchtheindex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Enter the  searched number ");
        int s = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if (arr[i]==s){
                System.out.println(i);
            }
        }
    }
}