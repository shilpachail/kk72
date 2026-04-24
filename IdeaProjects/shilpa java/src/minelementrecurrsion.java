import java.util.Scanner;
import java.util.Arrays;
public class minelementrecurrsion {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println( "the min element is"+" " + minelement(arr,0,arr[0]));
    }
    public static int minelement(int[] arr, int i, int min){
        if(i== arr.length){
            return min;
        }
        if(arr[i]<min){
            min= arr[i];
        }
        return minelement(arr,i+1,min);
    }
}
