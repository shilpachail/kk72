import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int m = num*num;
        int rem=m%10;
        if(num ==rem){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not a automorphic number");
        }
    }
}
