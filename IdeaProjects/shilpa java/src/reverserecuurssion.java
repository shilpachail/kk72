import java.util.Scanner;
public class reverserecuurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int num = sc.nextInt();
        System.out.println(rev(num,0));
    }
    public static int rev(int num,int rem ){
        if(num<=0){
            return rem;
        }
        int a =num%10;
        rem=(rem*10)+a;
        return rev(num/10,rem);
    }
}
