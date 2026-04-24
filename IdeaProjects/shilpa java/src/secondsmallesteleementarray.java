import java.util.Scanner;
import java.util.Arrays;
public class secondsmallesteleementarray {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        int small=arr[0];
        for(int i=0; i<n;i++ ){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        int secondsmall=Integer.MAX_VALUE;
        for(int i=0; i<n ;i++){
            if(arr[i]!=small && arr[i]<secondsmall){
                secondsmall=arr[i];
            }
        }
        System.out.println(" second smallest element is"+ " "+ secondsmall);
    }
}
