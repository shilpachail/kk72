import java.util.Scanner;
public class primerecurrsion {
    public static void main(String args []) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = in.nextInt();

        boolean a = prime(n,2);
        System.out.println(a+"is prime");

    }
    public static boolean prime( int n,int i  ){
        if(n<=2){
            return (n==2);
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
       return  prime(n, i+1);

    }
}
