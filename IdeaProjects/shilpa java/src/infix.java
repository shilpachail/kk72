import java.util.*;
public class infix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0 ;i< exp.length(); i++){
            char ch=exp.charAt(i);
            if(ch== ' '){
                continue;
            }
            else if(ch=='('){
                operators.push(ch);
            }
            else if(ch>='0' && ch<= '9') {
                operands.push(ch - '0');
            }
            else if(ch==')'){
                while(operators.peek() != ')'){
                    int val2=operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();

                    int result = operations(val1, val2, op);
                    operands.push(result);

                }
                operators.pop();
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(operators.size()>0 && operators.peek() !='(' && preccedence(ch)<=preccedence(operators.peek())){
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();

                    int result = operations(val1, val2, op);
                    operands.push(result);
                }
                operators.push(ch);
            }
        }
        while(operators.size()>0){
            int val2 = operands.pop();
            int val1 = operands.pop();
            char op = operators.pop();

            int result = operations(val1, val2, op);
            operands.push(result);
        }

        System.out.println(operands.peek());


    }

    public static int preccedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
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
