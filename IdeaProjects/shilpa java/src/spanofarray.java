import java.util.Scanner;
import java.util.Arrays;
public class spanofarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int small=smallest(arr,n);
        int large= largest(arr,n);
        System.out.println( "the smallest element is"+ " "+small);
        System.out.println( "the largest element is"+ " "+large);
        int span= large-small;
        System.out.println(span);

    }
    public static int largest(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int smallest(int[] arr , int n){
        int min=arr[0];
        for(int i=0; i<n;i++ ){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


}
