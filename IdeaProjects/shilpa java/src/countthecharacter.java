import java.util.Scanner;
public class countthecharacter {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String expr = sc.nextLine();
        int result = 0;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if(ch>='0'&&ch<='9') {
                result += ch - '0';
            }
        }
        System.out.println(result);
    }
}
