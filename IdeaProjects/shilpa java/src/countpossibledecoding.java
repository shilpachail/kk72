import java.util.Scanner;
public class countpossibledecoding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the no : ");
    int num = sc.nextInt();
    int result=countDecodings(String.valueOf(num));
        System.out.println(result);
}
    public static int countDecodings(String digits) {
        int n = digits.length();
        if (n == 0 || digits.charAt(0) == '0') return 0;

        int[] dp = new int[n + 1];
        dp[0] = 1; // empty string
        dp[1] = 1; // first digit is valid (already checked)

        for (int i = 2; i <= n; i++) {
            // Check if single digit is valid (not '0')
            if (digits.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // Check if two-digit number is between 10 and 26
            int twoDigit = Integer.parseInt(digits.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }


}
