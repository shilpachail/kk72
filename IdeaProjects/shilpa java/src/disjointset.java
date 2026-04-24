import java.util.Scanner;
import java.util.Arrays;
public class disjointset {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        boolean isdisjoint=true;
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                if(arr1[i]==arr2[j]){
                    isdisjoint=false;
                    System.out.println(arr1[i]+","+arr2[j]);
                    break;
                }
            }
        }

    }
}
