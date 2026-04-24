import java.util.*;
public class maxslidingwindow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Stack<Integer> st = new Stack<>();
        int arr2[] = new int[n];

        st.push(n - 1);
        arr2[n - 1] = n;
        int k =sc.nextInt();
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 &&  arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                arr2[i] = n;
            } else {
                arr2[i] = st.peek();
            }
            st.push(i);
        }
        int j=0;
        for(int i=0; i<=n-k;i++){

            if(j<i){
                j=i;
            }
            while(arr2[j]< i+k){
                j=arr2[j];
            }
            System.out.println(arr[j]);
        }
    }
}
