import java.util.Scanner;
public class powerrecurrsionlogn {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        System.out.println("Enter the power ");
        int x = in.nextInt();
        int a= check(x,n);
        System.out.println(a);

    }
    public static int check( int x,int n  ){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return check(x,n/2)* check(x,n/2);
        }
        else{
            return check(x,n/2)* check(x,n/2) *x;
        }
    }
}
