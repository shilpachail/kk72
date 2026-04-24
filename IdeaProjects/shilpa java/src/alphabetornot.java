import java.util.Scanner;
public class alphabetornot {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        for(int i=0; i<n.length();i++){
            char ch= n.charAt(i);
            // Convert to lowercase for easy comparison
            ch=Character.toLowerCase(ch);
            if(ch>='a'&& ch<='z') {
                System.out.println(ch + " is an alphapet");
            }
            else{
                System.out.println( ch + "  not an alphapet");
            }
        }
    }
}
