import java.util.Scanner;
public class octaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  no: ");
        int num = sc.nextInt();
        int ans = oct(num);
        dec(ans);
    }
    public static int oct(int num){
        int sum=0;
        for(int i =0; num>0 ; i++){

            int rem=num%10;
            sum += rem * Math.pow(8,i);
            num/=10;

        }
        return sum;
    }
    public static void dec(int a){
        int i=0;
        int [] rem = new int[20];
        for( i=0; a>0 ; i++){
            rem[i]= a%2;

            a/=2;
        }
        for (int j =i-1; j>=0; j--){
            System.out.print(rem[j]);

        }

    }
}

