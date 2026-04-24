import java.util.Scanner;
public class fibonaccirecursion {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();
        int a= 0,b=1;
        System.out.println(a);
        System.out.println(b);
        check(a,b,n-2);

    }
    public static void check(int a , int b , int n  ){
        if(n==0){
            return ;
        }

        int c= a*b;
        System.out.println(c);
        check(b,c, n-1);
    }

}
