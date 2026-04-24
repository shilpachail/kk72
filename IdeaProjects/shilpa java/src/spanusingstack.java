import java.util.*;
public class spanusingstack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[n];


        Stack<Integer> st = new Stack<>();
        arr2[0]=1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
               arr2[i]= i+1;
            }
            else{
                arr2[i] =i-st.peek();
            }
            st.push(i);
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr2[i]);
        }
    }
}
