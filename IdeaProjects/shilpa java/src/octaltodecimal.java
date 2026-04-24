import java.util.Scanner;
public class octaltodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i =0; num>0 ; i++){

            int rem=num%10;
            sum += rem * Math.pow(8,i);
            num/=10;

        }
        System.out.println(sum);

    }
}

