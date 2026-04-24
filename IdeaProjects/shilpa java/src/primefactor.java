import java.util.Scanner;
public class primefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        primefactor(num);
    }


    public static boolean checkprime (int n) {
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

public static void primefactor(int n){
    for(int i=2; i<=n;i++){
        if(checkprime(i)){
            while(n%i==0){
                System.out.println(i);
                n /=i;
            }
        }
    }

        }}


