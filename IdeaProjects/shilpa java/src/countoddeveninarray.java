import java.util.Scanner;
import java.util.Arrays;
public class countoddeveninarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+"is a even");
            }
            else{
                System.out.println(arr[i]+ "is a odd");
            }
        }
    }

}
