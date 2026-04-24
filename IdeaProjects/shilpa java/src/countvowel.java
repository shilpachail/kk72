import java.util.Scanner;
public class countvowel {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        int count =0;
        for(int i=0; i<n.length();i++){
            char ch= n.charAt(i);
            // Convert to lowercase for easy comparison
            ch=Character.toLowerCase(ch);
            if(ch>='a'&& ch<='z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " it is a vowel");
                    count++;
                } else {
                    System.out.println(ch + " it is a consant");
                }
            }
            else{
                System.out.println( ch + "  not an alphapet");
            }
        }
        System.out.println(count);
    }
}
