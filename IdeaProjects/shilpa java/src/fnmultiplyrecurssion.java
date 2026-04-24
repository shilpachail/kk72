import java.util.Scanner;
public class fnmultiplyrecurssion {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        System.out.println(check(1,1,n));
    }
    public static int check(int start, int count , int n){
        if(count==n+1)
            return 0;
        int product=1;
        for(int i=0;i<count;i++){
            product*=(start+i);
        }
        return product+ check(start+count,count+1,n);
    }
}
