import java.util.*;
public class parenthisissttackchecking {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String ss= sc.nextLine();
    Stack<Character> st= new Stack<>();
    for(int i=0; i<ss.length();i++){
        char ch= ss.charAt(i);
        if(ch==')'){
            if(!st.isEmpty() && st.peek() =='('){
                System.out.println(true);
                return;
            }
            else {
                while(!st.isEmpty() && st.peek() != '('){
                    st.pop();
                }
                if(!st.isEmpty()){
                st.pop();}
            }

        }
        else {
            st.push(ch);
        }

    }
        System.out.println(false);


}
}
