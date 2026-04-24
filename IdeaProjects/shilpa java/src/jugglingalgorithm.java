import java.util.Scanner;
import java.util.Arrays;
public class jugglingalgorithm {
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

        int[] leftrotate = Arrays.copyOf(arr, n);
        rotate(leftrotate,d);

        int[] rightrotate = Arrays.copyOf(arr, n);
        rotate(rightrotate, n-d);

        System.out.println("left rootate");
        for(int val: leftrotate)
            System.out.println(val);


        System.out.println("right rotate");
        for(int val: rightrotate)
            System.out.println(val);
    }
    public static int gcd(int a , int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }


    public static void rotate(int[] arr , int d ){
        int n = arr.length;
        int g= gcd(n,d);
        for(int i=0; i<g ;i++){
            int temp=arr[i];
            int j=i;
            while(true){
                int k =(j+d)%n;
                if(k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }

}
