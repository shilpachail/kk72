import java.util.Scanner;
public class noofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            int rev=num%10;
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}


