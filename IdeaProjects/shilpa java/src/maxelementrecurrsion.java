import java.util.Scanner;
import java.util.Arrays;
public class maxelementrecurrsion {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println( "the max element is"+" " + maxelement(arr,0,arr[0]));
    }
    public static int maxelement(int[] arr, int i, int max){
        if(i== arr.length){
            return max;
        }
        if(arr[i]>max){
            max= arr[i];
        }
        return maxelement(arr,i+1,max);
    }
}
