import java.util.Scanner;
public class fibonaccirange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        int nextterm = 0;
        if (num == 0) {
            nextterm = 0;
        } else if (num == 1) {
            nextterm = 1;
        } else {
            for (int i = 2; i <= num; i++) {
                nextterm = a + b;
                a = b;
                b = nextterm;


            }
            System.out.println(nextterm);

        }
    }
}