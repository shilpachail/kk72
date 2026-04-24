import java.util.Scanner;
import java.util.Arrays;
public class arrayisasubsetorrnot {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n2];

        boolean isubset = true;
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<n2;i++){
            boolean found = false;
            for(int j=0; j<n; j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }

            }
            if(!found){
                isubset=false;
                break;
            }

            }
        if(isubset){
            System.out.println("it is a subset");
        }
        else{
            System.out.println("not a subset");
        }
    }
}
