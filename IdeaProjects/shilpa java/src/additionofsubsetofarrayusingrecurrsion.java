import java.util.Scanner;
public class additionofsubsetofarrayusingrecurrsion {
        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            int[] arr=new int[n];
            System.out.println("enter the elements");
            for(int i=0 ; i<n ; i++){
                arr[i]= sc.nextInt();
            }
            int nm =arr.length;
            subsetsum(arr,0, nm-1,0);
        }
        public static void subsetsum(int[] arr, int l,int r, int sum){
            if(l>r){
                System.out.println(sum);
                return ;
            }
            subsetsum(arr,l+1, r , sum+arr[l]);
            subsetsum(arr, l+1,r ,sum);
        }
}
