import java.util.Scanner;
public class factorialrecurrsion {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        int a= check(n);
        System.out.println(a);

    }
    public static int check(int n  ){
        if(n==1||n==0){
            return 1;
        }
        int factnm1=check(n-1);
        int fact=n*factnm1;
        return fact;
    }

}
