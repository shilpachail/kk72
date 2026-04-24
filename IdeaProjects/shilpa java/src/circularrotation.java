import java.util.Scanner;
import java.util.Arrays;
public class circularrotation {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotations");
        int d = sc.nextInt();
         //right rotate array
        int[] rotate=new int[n];
        for(int i=0; i<n;i++){
            rotate[(i+d)%n]=arr[i];// for left roatte circular array (i-d+n)%n=arr[i];
        }
        System.out.printf("circular roatted array");
        for(int val:rotate){
            System.out.println(val);
        }
    }

}
