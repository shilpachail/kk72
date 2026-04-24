import java.util.*;
public class nextgretaerelementtotherightstack {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int arr2[]=new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0; i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                arr2[i]=-1;
            }
            else{
                arr2[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
    //jo peek se bara hai toh peek ko pop kara do
}
