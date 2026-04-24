import java.util.Scanner;
import java.util.Arrays;
public class removeduplicatelement {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited= new boolean[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i]=false;
        }

        for(int i=0; i<n;i++){
            if(visited[i])
                continue;
            boolean isduplicate=false;

            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    isduplicate=true;


                }
            }
            if(!isduplicate){
                System.out.println(arr[i]);
            }


        }


    }
}
