import java.util.Scanner;
public class wildcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string withh wildcard: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the string withhout wildcard: ");
        String str2 = scanner.nextLine();
        int i = 0, j = 0;
        boolean match = true;

        while ( i < str1.length() && j < str2.length()) {
            char ch = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if (ch == '?') {
                i++;
                j++;
            } else if (ch == '*') {
                i++;
                if (i == str1.length()) {
                    j = str2.length();
                    break;
                }
                while (j < str2.length() && str1.charAt(i) != str2.charAt(j)) {
                    j++;
                }
            } else if (ch == ch2) {
                i++;
                j++;
            } else {
                match = false;
                break;
            }
        }
        while (i < str1.length() && str1.charAt(i) == '*') {
            i++;
        }

        if (i != str1.length() || j != str2.length()) {
            match = false;
        }

        System.out.println("Match result: " + match);

    }

}


