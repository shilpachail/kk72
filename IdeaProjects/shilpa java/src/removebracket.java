import java.util.Scanner;
public class removebracket {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String expr = sc.nextLine();
        String result = "";

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Skip brackets
            if (ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') {
                continue;
            }

            result += ch; // Add non-bracket characters
        }
        System.out.println(result);
    }
}

