import java.util.Scanner;
public class greatestno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number1: ");
        int start = sc.nextInt();
        System.out.print("enter the number2: ");
        int num = sc.nextInt();
        System.out.print("enter the number3: ");
        int num1= sc.nextInt();
        if(start==num && start==num1){
            System.out.println("all the three  numbers are equal");
        }
        else if(start>num && start>num1) {
            System.out.println(start + "number1 is greater");
        }
        else if(num>start && num>num1){
            System.out.println( num + "number2 is greater");
        }
        else if(num1>start && num1>num){
            System.out.println(num1 +"number3 is greater");
        }

    }
}
