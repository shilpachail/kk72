import java.util.Scanner;
public class capatilizefirstandlastcharater {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String expr = sc.nextLine();
        String result="";
        for(int i=0; i<expr.length();i++){
            char ch=expr.charAt(i);
            if(i == 0 || i==expr.length()-1){
                result += Character.toUpperCase(ch);
            }
            else{
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
