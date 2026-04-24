import java.util.Scanner;
public class perrmutationrecurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of people: ");
        String num= sc.nextLine();
        check(num,"");
    }
    public static void check(String str , String current) {
        if (str.isEmpty()) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaning = str.substring(0, i) + str.substring(i + 1);
            check(remaning, current + ch);
        }
    }
}
