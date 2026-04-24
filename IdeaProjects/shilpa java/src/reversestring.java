import java.util.Scanner;
public class reversestring {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        String result="";
        for(int i=n.length()-1;i>=0;i--){
            result+= n.charAt(i);
        }
        System.out.println(result);
    }

}
