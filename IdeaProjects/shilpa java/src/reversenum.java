import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int rem=0;
        int rev= 0;
        int num = sc.nextInt();
        while (num != 0) {
            rem= num % 10;
            rev=(rev*10)+ rem;
            num = num / 10;


        }
        System.out.print("rev no is: ");
        System.out.println(rev);

    }
}
