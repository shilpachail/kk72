import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int temp = num;
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans + factorial(rem);
            num /= 10;
        }
        if (ans == temp) {
            System.out.println("strong num");
        } else {
            System.out.println("not a strong no");
        }
    }


    public static int factorial(int num) {
        int fact = 1;
        if (num == 0) {
            fact = 1;
        } else if (num == 1) {
            fact = 1;
        } else {
            for (int i = num; i >= 2; i--) {
                fact = fact * i;
            }

        }
        return fact;
    }
}







