import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("it is a positive number");
        }
        else{
            System.out.println("it is a negative number");
        }

    }
}
