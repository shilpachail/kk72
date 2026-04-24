import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int num = sc.nextInt();
        System.out.print("enter the digit : ");
        int rev = sc.nextInt();
        int count=0;
        while(num>0){
           int rem = num%10;
        if(rev==rem){
            count++;
            }
        num /=10;


        }
        System.out.println(count);

    }
}

