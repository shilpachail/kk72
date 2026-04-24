import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class rankinarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sorted= Arrays.copyOf(arr,n);
        Arrays.sort(sorted);

        Map<Integer,Integer>rankmap= new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!rankmap.containsKey(sorted[i])){
                rankmap.put(sorted[i],rank++);
            }
        }
        for(int i=0;i<n ;i++){
            arr[i]=rankmap.get(arr[i]);
            System.out.println(arr[i]);
        }

    }

}
