import java.util.*;
public class infixtopostfixandprefix {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Character> operators = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for(int i = 0; i < exp.length(); i++){

            char ch = exp.charAt(i);

            // operand
            if(Character.isLetterOrDigit(ch)){
                postfix.push(ch + "");
                prefix.push(ch + "");
            }

            // opening bracket
            else if(ch == '('){
                operators.push(ch);
            }

            // closing bracket
            else if(ch == ')'){

                while(operators.peek() != '('){

                    char op = operators.pop();

                    // postfix
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    postfix.push(postv1 + postv2 + op);

                    // prefix
                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    prefix.push(op + prev1 + prev2);
                }

                operators.pop();
            }

            // operator
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){

                while(operators.size()>0 && operators.peek()!='('
                        && precedence(operators.peek()) >= precedence(ch)){

                    char op = operators.pop();

                    // postfix
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    postfix.push(postv1 + postv2 + op);

                    // prefix
                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    prefix.push(op + prev1 + prev2);
                }

                operators.push(ch);
            }
        }

        while(operators.size()>0){

            char op = operators.pop();

            // postfix
            String postv2 = postfix.pop();
            String postv1 = postfix.pop();
            postfix.push(postv1 + postv2 + op);

            // prefix
            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            prefix.push(op + prev1 + prev2);
        }

        System.out.println("Postfix: " + postfix.peek());
        System.out.println("Prefix: " + prefix.peek());
    }

    public static int precedence(char op){
        if(op=='+' || op=='-') return 1;
        else return 2;
    }
}
