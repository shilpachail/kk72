import java.util.Scanner;
public class togglrcharacter {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        String result=" ";
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(Character.isUpperCase(ch)){
                result+= Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                result+= Character.toUpperCase(ch);
            }
            else{
                result+= ch;
            }

        }
        System.out.println(result);
    }
}
