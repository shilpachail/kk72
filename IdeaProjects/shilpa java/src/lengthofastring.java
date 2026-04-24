import java.util.Scanner;
public class lengthofastring {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        int sum=0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            sum++;
        }
        System.out.println(sum);
    }
}
