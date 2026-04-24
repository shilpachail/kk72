import java.util.Scanner;
public class gcd {
    public static int gcd(int num1, int num2) {
        if (num2 == 0)
            return num1;

        return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first no: ");
        int num = sc.nextInt();
        System.out.print("enter the  second no: ");
        int num2 = sc.nextInt();
        System.out.println(gcd(num , num2));
    }
}
