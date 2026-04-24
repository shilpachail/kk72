import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");


        double num = sc.nextDouble();
        System.out.print("enter the   no: ");
        double last = sc.nextDouble();
        System.out.println("enter the power");
        double ans = 0;
        ans = Math.pow(num, last);
        System.out.println(ans);
    }
}