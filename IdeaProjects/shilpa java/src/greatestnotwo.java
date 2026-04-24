import java.util.Scanner;
public class greatestnotwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number1: ");
        int start = sc.nextInt();
        System.out.print("enter the number2: ");
        int num = sc.nextInt();
        if(start==num){
            System.out.println("both the numbers are equal");
        }
        else if(start>num) {
            System.out.println(start + "number1 is greater");
        }
        else{
            System.out.println( num + "number2 is greater");
        }

    }
}

