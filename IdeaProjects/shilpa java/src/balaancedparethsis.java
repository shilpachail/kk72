import java.io.*;
import java.util.*;
public class balaancedparethsis {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ss= sc.nextLine();
        Stack<Character> st= new Stack<>();
        for(int i=0; i<ss.length();i++) {
            char ch = ss.charAt(i);
            if(ch== '(' || ch=='{' ||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                boolean val= handleclosing(st,'(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch==']'){
                boolean val=  handleclosing(st,'[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch=='}'){
                boolean val= handleclosing(st,'{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean handleclosing(Stack<Character> st , char corresoch){
        if(st.size()==0){
            return false;
        }
        else if(st.peek() != corresoch){
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }
}
