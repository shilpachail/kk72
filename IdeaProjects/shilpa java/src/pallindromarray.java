import java.util.Arrays;
import java.util.Scanner;
public class pallindromarray {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        String result="";
        for(int i=n.length()-1;i>=0;i--){
            result+= n.charAt(i);
        }
        if(n.equals(result)){
            System.out.println("yes it is pallindromw");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }

}
