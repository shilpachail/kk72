import java.util.Scanner;
public class expressedasasumofprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int num = sc.nextInt();
        boolean found = false;// int count=0;

        for(int i=2; i<=num/2;i++) {
            if (prime(i) && prime(num - i)) {

                System.out.println(num + "=" + i + "+" + (num - i));
                found = true;//count++
            }
        }
        if(!found){//count==0
            System.out.println(num+"cannot be expressed as a sum of prime no");
        }
    }

    public static boolean prime(int n){
        int count = 0;
        if (n < 2) {
            return false;

        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count > 2)
            return false;

        else
            return true;
    }
}