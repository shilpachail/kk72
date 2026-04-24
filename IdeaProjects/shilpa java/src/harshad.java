import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int sum = 0;
        int num = sc.nextInt();
        int temp=num;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;


        }
        if(temp%sum==0){
            System.out.println("it is a harshad number");
        }
        else{
            System.out.println("not a harshad number");
        }
    }
}
