import java.util.*;
public class posttfixconversions {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Integer> valuestack = new Stack<>();
        Stack<String>  infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for(int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                infix.push(ch + "");
                prefix.push(ch + "");
                valuestack.push(ch- '0');
            }
            else if( ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 =valuestack.pop();
                int v1= valuestack.pop();
                int val= operations(v1,v2,ch);
                valuestack.push(val);

                String i2=infix.pop();
                String i1= infix.pop();
                String ival="(" +i1 + ch + i2 + ")";
                infix.push(ival);

                String p2= prefix.pop();
                String p1= prefix.pop();
                String pval= ch + p1 + p2 ;
                prefix.push(pval);
            }
        }
        System.out.println(valuestack.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());
        }
    public static int operations(int v1, int v2, char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1 - v2;
        }
        else if(op=='*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }
}
