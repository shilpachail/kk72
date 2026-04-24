import java.util.Scanner;

public class replacesubstringfromastring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String toReplace = scanner.nextLine();

        System.out.print("Enter the new substring: ");
        String replacement = scanner.nextLine();

        String modified = original.replace(toReplace, replacement);
        System.out.println("Modified string: " + modified);


    }
}
