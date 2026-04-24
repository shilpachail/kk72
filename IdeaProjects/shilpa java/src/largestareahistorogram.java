import java.util.*;
public class largestareahistorogram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] rb= new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1]=arr.length;

        for(int i=arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=arr.length;
            }
            else{
                rb[i] =st.peek();
            }
            st.push(i);
        }

        int[] lb= new int[arr.length];
        Stack<Integer> sp = new Stack<>();
        sp.push(0);
        lb[0]= -1;
        for(int i=1; i<n; i++){
            while(sp.size()>0 && arr[i]<arr[sp.peek()]){
                sp.pop();
            }
            if(sp.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i] =sp.peek();
            }
            sp.push(i);
        }

        int maxarea=0;
        for(int i=0;i<n;i++){
            int width = rb[i]-lb[i] - 1;
            int area= width*arr[i];
            if(area>maxarea){
                maxarea=area;
            }
        }
        System.out.println(maxarea);
    }

}
