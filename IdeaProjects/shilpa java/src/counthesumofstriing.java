import java.util.Scanner;
public class counthesumofstriing {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String expr = sc.nextLine();
        int sum=0;
        for(int i=0; i<expr.length();i++){
            char ch=expr.charAt(i);
            if(Character.isDigit(ch)){
                sum= sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}
