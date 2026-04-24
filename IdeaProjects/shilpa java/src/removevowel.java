import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class removevowel {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String n = sc.nextLine();
        ArrayList<Character> vowels= new ArrayList<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        String result="";
        for(int i=0; i<n.length();i++){
            char ch= n.charAt(i);
            if(!vowels.contains(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
