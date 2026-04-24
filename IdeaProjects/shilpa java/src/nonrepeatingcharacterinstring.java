import java.util.Scanner;
public class nonrepeatingcharacterinstring {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String expr = sc.nextLine();
        boolean[] visited= new boolean[expr.length()];
        for(int i=0; i<expr.length();i++) {
            char ch = expr.charAt(i);
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < expr.length(); j++) {
                if (expr.charAt(j) == ch) {
                    visited[j] = true;
                    count++;
                }

            }
            if (count == 1)
                System.out.println(ch);


        } }
}
