import java.util.Scanner;
public class friendlypair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        System.out.print("enter the second no: ");
        int temp = sc.nextInt();
        int num1=friend(num);
        int num2=friend(temp);
        if( num1 / num == num2 / temp) {
            System.out.println("it is a friendly pair");
        }
        else{
            System.out.println("not a friendly pair");
        }

    }
    public static int friend(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    }

