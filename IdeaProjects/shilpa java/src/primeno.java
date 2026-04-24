import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num= sc.nextInt();
        checkprime(num);
    }
    public static void checkprime (int n){
        int count=0;

        if(n<2){
            System.out.println("not a prime no");
            System.exit(0);
        }

        for(int i=1; i<=n;i++){
            if(n%i == 0){
            count = count+1;
            }
        }
        if(count>2)
            System.out.println("not a prime num");

        else
            System.out.println("is a primme number");

    }


}

