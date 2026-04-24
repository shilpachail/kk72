import java.util.Scanner;
public class primerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num= sc.nextInt();
        System.out.print("enter the  last no: ");
        int last= sc.nextInt();
        System.out.println("the prime numbers are:");
        for(int i = num; i<=last;i++){
            if(checkprime(i)){
                System.out.println(i);

            }
        }
    }
    public static boolean checkprime (int n){
        int count=0;
        if(n<2){
            return false;

        }
        for(int i = 1; i<=n ;i++){
            if(n%i == 0){
                count = count+1;
            }
        }
        if(count>2)
            return false;

        else
            return true;

    }



}
