import java.util.Scanner;
public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of people: ");
        int num = sc.nextInt();
        System.out.print("enter the  no of seats: ");
        int r = sc.nextInt();
        int sub = (num -r);
        int n1= fact(num);
        int n2= fact(sub);
        int n3= n1/n2;
        System.out.println("total possible arrangements"+ n3);
    }
    public static int fact(int num){
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
        return fact;

    }
}
