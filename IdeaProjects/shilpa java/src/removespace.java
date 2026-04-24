import java.util.Scanner;
public class removespace {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        String result= n.replaceAll(" ","");
        System.out.println(result);
    }

}
