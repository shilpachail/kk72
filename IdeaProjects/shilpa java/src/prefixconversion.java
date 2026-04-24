import java.util.*;
public class prefixconversion {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Integer> valuestack = new Stack<>();
        Stack<String>  infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for(int i = exp.length() -1; i >=0; i--) {

            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                infix.push(ch + "");
                postfix.push(ch + "");
                valuestack.push(ch- '0');
            }
            else if( ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v1 =valuestack.pop();
                int v2= valuestack.pop();
                int val= operations(v1,v2,ch);
                valuestack.push(val);

                String i1=infix.pop();
                String i2= infix.pop();
                String ival="(" +i1 + ch + i2 + ")";
                infix.push(ival);

                String p1= postfix.pop();
                String p2= postfix.pop();
                String pval=  p1 + p2 + ch ;
                postfix.push(pval);
            }
        }
        System.out.println(valuestack.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
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
