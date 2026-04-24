import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int rem=0;
        int rev= 0;
        int num = sc.nextInt();
        int temp=num;
        while (num != 0) {
            rem= num % 10;
            rev=(rev*10)+ rem;
            num = num / 10;


        }
        if(temp==rev){
            System.out.println("it is a pallindrome number");
        }
        else{
            System.out.println("not a pallindrome numberr");
        }


    }
}
