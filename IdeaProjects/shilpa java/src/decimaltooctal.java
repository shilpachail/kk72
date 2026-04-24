import java.util.Scanner;
public class decimaltooctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        int num = sc.nextInt();
        int i=0;
        int [] rem = new int[20];
        for( i=0; num >0; i++){
            rem[i]= num%8;

            num/=8;
        }
        for (int j =i-1; j>=0; j--){
            System.out.print(rem[j]);

        }

    }
}
