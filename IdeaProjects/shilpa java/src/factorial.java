import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        int fact=1;
        if(num==0){
            fact=1;
        }
        else if(num==1){
            fact=1;
        }
        else {
            for (int i = num; i >= 2; i--) {
                fact = fact * i;
            }
        }
        System.out.print("the factorial of the number");
        System.out.println(fact);

    }
}
