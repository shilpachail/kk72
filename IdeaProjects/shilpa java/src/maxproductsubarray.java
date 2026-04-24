import java.util.Scanner;
import java.util.Arrays;
public class maxproductsubarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxproduct= Integer.MIN_VALUE;
        for(int i=0;i<n ; i++){
            int product=1;
                for(int j=i; j<n;j++){
                    product *= arr[j];
                    if(product>maxproduct){
                        maxproduct=product;
                    }
                }

        }
        System.out.println(maxproduct);
    }

}
