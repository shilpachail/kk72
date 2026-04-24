import java.util.Scanner;
import java.util.Arrays;
public class canwemakeallelemntsequal {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(check(arr,n)){
            System.out.println("yes it can be made equal");
        }
        else{
            System.out.println("no it cannot be equal");
        }
    }
    public static boolean check(int[] arr , int n){
        for(int i=0;i<n ; i++){
            while(arr[i]%2==0){
                arr[i]/=2;
            }
            while(arr[i]%3==0){
                arr[i]/=3;
            }
        }
        for(int i=1; i<n ;i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
}
