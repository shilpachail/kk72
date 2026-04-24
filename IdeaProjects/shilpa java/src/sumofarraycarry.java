import java.util.Scanner;
import java.util.Arrays;
public class sumofarraycarry {
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
        int[] sum= new int[max+1];
        int carry=0;
        int i=n-1;
        int j=m-1;
        int k = max;

        while(k>=0){
            int val=carry;
            if(i>=0){
                val+=arr[i];
                i--;
            }
            if(j>=0){
                val+=arr2[j];
                j--;
            }
            sum[k]=val%10;
            carry=val/10;
            k--;
        }
        for(int x=0; x< sum.length; x++){
            if(!(x==0&& sum[x]==0)){
                System.out.println(sum[x]);
            }
        }

    }
}
