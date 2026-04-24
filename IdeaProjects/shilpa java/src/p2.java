import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is an odd number");
        }

    }
}
