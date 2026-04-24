import java.util.Scanner;
import java.util.Arrays;
public class pallindromearray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n ; i++){
            if(pallindrome(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean pallindrome(int num){
        int rem=0;
        int rev= 0;
        int temp=num;
        while (num != 0) {
            rem= num % 10;
            rev=(rev*10)+ rem;
            num = num / 10;
        }
        return temp== rev;

    }

}
