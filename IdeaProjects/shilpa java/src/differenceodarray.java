import java.util.Scanner;
import java.util.Arrays;
public class differenceodarray {
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

        int[] diff  = new int[n];
        int borrow = 0;
        int i = n - 1;
        int j = m - 1;
        int k = diff.length-1;

        while(k>=0){
            int val= arr[i]+ borrow;
            int digit2=0;
            if(j>=0){
                digit2=arr2[j];
            }
            if(val< digit2){
                val= val+10;
                borrow=-1;
            }
            else{
                borrow=0;

            }
            diff[k]= val-digit2;

            i--;
            j--;
            k--;
        }
        int x=0;
        while(x<diff.length&& diff[x]==0){
            x++;
        }
       while(x<diff.length){
           System.out.println(diff[x]);
           x++;
       }
    }
}
