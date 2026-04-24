import java.util.Scanner;
public class binarytooctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        int num = sc.nextInt();
        int ans = dec(num);
        oct(ans);
    }

    public static int dec(int n) {
        int sum = 0;
        for (int i = 0; n > 0; i++) {
            int rem = n % 10;
            sum += rem * Math.pow(2, i);
            n /= 10;

        }
        return sum;
    }


    public static void oct(int a) {
        int i = 0;
        int p = 0;
        int[] rem = new int[20];
        for (i = 0; a > 0; i++) {
            rem[i] = a % 8;

            a /= 8;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(rem[j]);

        }

    }
}




