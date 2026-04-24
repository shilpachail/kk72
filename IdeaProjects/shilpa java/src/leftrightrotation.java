import java.util.Scanner;
import java.util.Arrays;
public class leftrightrotation {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotation");
        int left=sc.nextInt();
        System.out.println("enter the rotation");
        int right=sc.nextInt();
        int[] leftroated=Arrays.copyOf(arr,n);
        int[] rightroated=Arrays.copyOf(arr,n);
        for(int i=0;i<right;i++){
            int temp= rightroated[n-1];
            for(int j=n-1;j>0;j--){
                rightroated[j]=rightroated[j-1];
            }
            rightroated[0]=temp;
        }
        for(int i=0;i<left;i++) {
            int temp = leftroated[0];
            for (int j = 0; j < n - 1; j++) {
                leftroated[j] = leftroated[j +1];
            }
            leftroated[n - 1] = temp;
        }
        System.out.println("right array");
        for(int val:rightroated){
            System.out.println(val);
        }
        System.out.println("left array");
        for(int val:leftroated){
            System.out.println(val);
        }
    }


}
