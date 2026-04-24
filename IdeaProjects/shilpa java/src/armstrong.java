import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");


        int num = sc.nextInt();
        System.out.print("enter the  last no: ");
        int last= sc.nextInt();
        System.out.println("the armstrong num are:");
        for(int i = num; i<=last;i++){
            if(checkarm(i)){
                System.out.println(i);

            }
        }
    }
        public static boolean checkarm (int num){
            int temp = num;
            int rem = 0;
            int rev = 0;
            int n = 0;
            n = String.valueOf(num).length();
            while (num != 0) {
                rem = num % 10;

                rev += Math.pow(rem, n);
                num = num / 10;


            }
            if (temp == rev) {
                return true;
            } else {
                return false;
            }
        }

    }

