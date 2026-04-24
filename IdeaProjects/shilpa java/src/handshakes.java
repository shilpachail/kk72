import java.util.Scanner;
public class handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of people: ");
        int num = sc.nextInt();
        int ans = ((num-1) * num)/2 ;
        System.out.println("the max no of handshakes"+ ans);
    }
}
