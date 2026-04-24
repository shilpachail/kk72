import java.util.Scanner;
public class exactlyxdivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range : ");
        int num = sc.nextInt();
        System.out.print("enter the divisor : ");
        int x = sc.nextInt();
        int count=0;
        for(int i =1; i<=num;i++) {
            if (check(i) == x) {
                count++;
            }
        }
               System.out.println(count);



    }
    public static int check(int n){
        int count = 0;
        for(int i =1 ; i<=n ;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;

    }


}
