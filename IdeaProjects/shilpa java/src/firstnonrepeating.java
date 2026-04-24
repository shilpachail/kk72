import java.util.Scanner;

public class firstnonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                break;
            }
        }
    }
}