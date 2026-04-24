import java.util.Scanner;
public class asciivalueofacharacter {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        char ch = n.charAt(0);
        int asccii=(int) ch;
        System.out.println(asccii);
    }
}
