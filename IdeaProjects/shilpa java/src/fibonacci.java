import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a +b);
        int nextterm =0;

        for(int i=2; i<=num;i++){
            nextterm= a+b;
            a=b;
            b=nextterm;

            System.out.println(nextterm);


        }
    }
}
